package stackRear;


public class DemoList {

	public static void runMenu() {
		int choice = 0;
		int numberOfOperations = 10;
		StackRear list = new StackRear();
		do {
			System.out.print("\n1:PushAtRear 2:PopRear 3:DisplayFromFront 4.DisplayFromRear 5:Exit.  Your Choice: ");
			choice = StackRear.scanner.nextInt();
			switch(choice) {
			case 1 : list.insertAtRear(); break;
			case 2 : list.deleteFromRear(); break;
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
