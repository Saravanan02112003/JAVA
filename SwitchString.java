package first;

public class SwitchString {
	public static void main(String args[]) {
		String levelString="Exp";
		int level=4;
		//used string in expression
		switch(levelString) {
		case "Beginner":level=1;
		break;
		case "Intermediate":level=2;
		break;
		case "Expert":level=3;
		break;
		case "Exp":level=4;
		break;
		default:level=0;
		break;
		
		}
		System.out.println("your level is " +level);
	}

}
