package examples;

public class ExampleOfExceptions5 {

	public static void main(String[] args) {
//		example1();
		
//		example2();
		
		example3(19);
	}

//	If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
	public static void example1() {
		int[] myNumbers = { 1, 2, 3 };
		System.out.println(myNumbers[10]);

//		try {
//			int[] myNumbers = { 1, 2, 3 };
//			System.out.println(myNumbers[10]);
//		} catch (Exception e) {
//			System.out.println("Something went wrong.");
//		}
	}

//	The finally statement lets you execute code, after try...catch, regardless of the result:
	public static void example2() {
		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
	}

//	The throw statement allows you to create a custom error.
	
//	The throw statement is used together with an exception type. There are many exception types 
//	available in Java: ArithmeticException, FileNotFoundException, 
//	ArrayIndexOutOfBoundsException, SecurityException, etc:
	
	public static void example3(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}
}
