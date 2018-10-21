package FFF;

public class finally_ {

	public static void main(String[] args) {
//		test();	
//		test1();
		Arthematic();

	}
	
	
	/*finally is a block which is associated with try catch blocks.
	 * finally block doesn't matter weather the exception is coming or not,
	 *  but it will execute the code which we have written in the finally block.
	 *  
	 *  for driver.quite() in side finally block
	 * */
	public static void test() {
		try {
			System.out.println("inside try block ");
			throw new RuntimeException("Exception");
		} catch (Exception e) {
			System.out.println(" inside Catch block ");
		}
		finally {
			System.out.println("inside finally block");
		}
	}

	public static void test1() {
		try {
			System.out.println("inside try block test1 method");			
		} finally {
			System.out.println("inside finally test1 method");
		}
	}
	
	public static void Arthematic() {
		int i=10;
		try {
		System.out.println("inside try block Arthematic method");
		int k=i/0;
			
		} catch (NullPointerException e) {
			System.out.println("ArithmeticException_ in catch block");
			System.out.println("which is divided by 0");
		}
		finally {
			System.out.println("inside finally it is Arthematic exception");
		}
	}
}
