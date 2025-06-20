package stacklist;

import java.util.Scanner;

public class StackFront {
	private Node head;
	static Scanner scanner;
	
	static {
		scanner = new Scanner(System.in);
	}
	
	public StackFront() {
		head = null;
		System.out.println("An empty list is created");
	}
	
	public Node createNode() {
		System.out.println("Enter Id and Name of the Person:");
		int id = scanner.nextInt();
		String name = scanner.next();
		Person person = new Person(id, name);
		Node node = new Node(person,null);
		return node;
	}
		
	public void pushfront() {
		Node newNode = createNode();
		if(head == null) { // Check if list is empty
			head = newNode; // make the new node as 1st node
			return;
		}
		newNode.setLink(head); // make the new node point to existing 1st node
		head = newNode; // make the new node as 1st node of the list
	}

	

	public void popfront() {
		if(head == null) { // Check if list is empty
			System.out.println("List is empty");
			return;
		}
		System.out.println("Node with data: " + head.getData() + " is deleted");
		head = head.getLink();
	}

	


	public void displayFromFront() {
		if(head == null) { // Check if list is empty
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.getLink();
		}
	}
	
	
}
