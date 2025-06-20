package queue;

import java.util.Scanner;

public class QueueFront {
	private Node head;
	public static Scanner scanner;
	
	static {
		scanner = new Scanner(System.in);
	}
	
	public QueueFront() {
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
		
	public void insertAtFront() {
		Node newNode = createNode();
		if(head == null) { // Check if list is empty
			head = newNode; // make the new node as 1st node
			return;
		}
		newNode.setLink(head); // make the new node point to existing 1st node
		head = newNode; // make the new node as 1st node of the list
	}

	

	
	public void deleteFromRear() {
		if(head == null) { // Check if list is empty
			System.out.println("List is empty");
			return;
		}
		if(head.getLink() == null) { // list has one node
			System.out.println("Node with data: " + head.getData() + " is deleted");
			head.setLink(null);
		}
		Node temp = head;
		while(temp.getLink().getLink() != null) // check if link of next node is null
			temp = temp.getLink();
		System.out.println("Node with data: " + temp.getLink().getData() + " is deleted");
		temp.setLink(null); // make the last but node as last node
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
