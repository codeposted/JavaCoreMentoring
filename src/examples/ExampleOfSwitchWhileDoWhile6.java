package examples;

public class ExampleOfSwitchWhileDoWhile6 {

	public static void main(String[] args) {
//		example1();
//		example2();
		example3();
	}

//	example 1
	public static void example1() {
		int day = 6;
//		inside bracket is expression
		switch (day) {
		case 1:
//			the associated block of code is executed
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Opps... which planet is this?");
		}
	}
	
//	example 2 while loop, sum of the numbers from 1 to 10
	public static void example2() {
		int x = 1, sum = 0; 
		  
        // Exit when x becomes greater than 10 
        while (x <= 10) { 
            // summing up x 
            sum = sum + x; 
  
            // Increment the value of x for 
            // next iteration 
            x++; 
        } 
        System.out.println("Summation: " + sum);
	}

//	example 3 do while loop
//	The loop will always be executed at least once
	public static void example3() {
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5);
	}
}
