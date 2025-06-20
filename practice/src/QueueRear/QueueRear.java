package QueueRear;

import java.util.Scanner;

public class QueueRear {
	private Node head;
	public static Scanner scanner;
	
	static {
		scanner = new Scanner(System.in);
	}
	
	public QueueRear() {
		head = null;
		System.out.println("An empty list is created");
	}
	
	public Node createNode() {
		System.out.println("Enter Id and Name of the Person:");
		int id = scanner.nextInt();
		String name = scanner.next();
		Person person = new Person(id, name);
		Node node = new Node(person, null);
		return node;
	}
		

	public void insertAtRear() {
		Node newNode = createNode();
		if(head == null) { // Check if list is empty
			head = newNode; // make the new node as 1st node
			return;
		}
		Node temp = head;
		while(temp.getLink() != null) { // Check if last node is not reached
			temp = temp.getLink(); // traverse to next node
		}
		temp.setLink(newNode); // set the link part of temp node to newNode
	}

	public void deleteFromFront() {
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
	
	public void printRecursively(Node head) {
		if(head == null)
			return;
		printRecursively(head.getLink());
		System.out.print(head.getData());
	}
	
	public void displayFromRear() {
		if(head == null) { // Check if list is empty
			System.out.println("List is empty");
			return;
		}
		printRecursively(head);
	}	
}
