package QueueRear;


public class ListDemo {

	public static void runMenu() {
		int choice = 0;
		int numberOfOperations = 20;
		QueueRear list = new QueueRear();
		do {
			System.out.print("\n1:InsertRear 2:DeleteFront 3:DisplayFromFront 4:DisplayFromRear 5:Exit.  Your Choice: ");
			choice = QueueRear.scanner.nextInt();
			switch(choice) {
			case 1 : list.insertAtRear(); break;
			case 2 : list.deleteFromFront(); break;
			case 3 : list.displayFromFront(); break;
			case 4 : list.displayFromRear(); break;
			case 5 : numberOfOperations = 0; break;
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
