package first;

public class JavaMethodStatic {
    //static return type function name
	static void myStaticMethod() {
		System.out.println("Static methods can be called without create objects");
		
	}
	// Main method
	
		public static void main(String args[]) {
			myStaticMethod(); //call the static method
			//myPblicMethod(); this would complie an error	
	}

}
