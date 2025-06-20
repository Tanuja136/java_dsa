package stacklist;


public class DemoList {

	public static void runMenu() {
		int choice = 0;
		int numberOfOperations = 10;
		StackFront list = new StackFront();
		do {
			System.out.print("\n1:PushFront 2:PopFront 3:DisplayFromFront 4:Exit.  Your Choice: ");
			choice = StackFront.scanner.nextInt();
			switch(choice) {
			case 1 : list.pushfront(); break;
			case 2 : list.popfront(); break;
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
