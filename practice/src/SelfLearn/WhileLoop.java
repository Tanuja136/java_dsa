package SelfLearn;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
		while(i<=4) {
			System.out.println("tanu "+ i );
			int j = 1;
			while(j <= 3) {
				System.out.println("hello " + i);
				j++;
			}
			i++;
		}
		System.out.println("end " + i); //from above condition if i == 11 then it is jumped out of loop and executes this stmt.
	}

}
