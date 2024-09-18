package first;

/* if else if syntax:
 * if(condition)
 * {statement;
 * }
 * else if(condition2)
 * {
 * statement;}
 * else if(condition n)
 *  {
 * statement;}
 * 
 */

public class ControlFlowIfElseIf {
	public static void main(String args[]) {
		int avg=71;
		if(avg>100 ) {
			System.out.println("you are fail");
		}
		else if(avg>=50 && avg<=60) {
			System.out.println("you are d grade");
		}
		else if(avg>60 && avg<=70) {
			System.out.println("you are c grade");
		}
		else if(avg>70 && avg<=80) {
			System.out.println("you are b grade");
		}
		else if(avg>80 && avg<=90) {
			System.out.println("you are a grade");
		}
		else if(avg>90 && avg<=100) {
			System.out.println("you are 0 grade");
		}
		else {
			System.out.println("invalid grade");
		}
	}

}
