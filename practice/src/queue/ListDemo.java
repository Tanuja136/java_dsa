package queue;


public class ListDemo {

	public static void runMenu() {
		int choice = 0;
		int numberOfOperations = 20;
		QueueFront list = new QueueFront();
		do {
			System.out.print("\n1:InsertFront 2:DeleteRear 3:DisplayFromFront 4:Exit. \t Your Choice: ");
			choice = QueueFront.scanner.nextInt();
			switch(choice) {
			case 1 : list.insertAtFront(); break;
			case 2 : list.deleteFromRear(); break;
			case 3 : list.displayFromFront(); break;
			case 4 : numberOfOperations = 0; break;
			default: System.out.println("Invalid Choice");
			}
			numberOfOperations--;
		}while(numberOfOperations >= 1);
	}
	
	public static void main(String[] args) {
		runMenu();
		System.out.println("End of Program");
	}
}
