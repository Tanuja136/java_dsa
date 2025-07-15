package day_22;

public class SegmentTree {
    
    static class SegmentTreeImpl {
        long[] tree;
        int n;

        SegmentTreeImpl(int[] arr) {
            n = arr.length;
            tree = new long[4 * n];
            build(arr, 1, 0, n - 1);
        }

        void build(int[] arr, int node, int l, int r) {
            if (l == r) {
                tree[node] = arr[l];
            } else {
                int mid = (l + r) / 2;
                build(arr, 2 * node, l, mid);
                build(arr, 2 * node + 1, mid + 1, r);
                tree[node] = tree[2 * node] + tree[2 * node + 1];
            }
        }

        void update(int idx, int val) {
            update(1, 0, n - 1, idx, val);
        }

        void update(int node, int l, int r, int idx, int val) {
            if (l == r) {
                tree[node] = val;
            } else {
                int mid = (l + r) / 2;
                if (idx <= mid) {
                    update(2 * node, l, mid, idx, val);
                } else {
                    update(2 * node + 1, mid + 1, r, idx, val);
                }
                tree[node] = tree[2 * node] + tree[2 * node + 1];
            }
        }

        long query(int ql, int qr) {
            return query(1, 0, n - 1, ql, qr);
        }

        long query(int node, int l, int r, int ql, int qr) {
            if (qr < l || r < ql) return 0;
            if (ql <= l && r <= qr) return tree[node];
            int mid = (l + r) / 2;
            return query(2 * node, l, mid, ql, qr) +
                   query(2 * node + 1, mid + 1, r, ql, qr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8};  // Sample array
        SegmentTreeImpl st = new SegmentTreeImpl(arr);

        System.out.println("Sum from 1 to 3: " + st.query(1, 3));  // Output: 4 + 5 + 7 = 16

        st.update(2, 10);  // Update index 2 to value 10

        System.out.println("Sum from 1 to 3 after update: " + st.query(1, 3));  // Output: 4 + 10 + 7 = 21
    }
}
