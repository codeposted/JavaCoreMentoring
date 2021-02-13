package examples;

public class ExamplesOfArrays2 {

	public static void main(String[] args) {
//		example1();

//		example2();
		
		example3();
	}

//	example 1
// creating an array and printing elements
	public static void example1() {
//		creating an array, array size is fixed
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

		System.out.println("Array`s length is " + array.length);

//		for loop for printing elements in array
		for (int i = 0; i < array.length; i++) {

//			for printing  ","
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
	}

//	example 2, reverse an array
	public static void example2() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Array before reverse:");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

//		reversing
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}

		System.out.println("\nArray after reverse:");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

//	example 3, the minimum and the maximum element in an array

	public static void example3() {
		int numbers[] = new int[] { 8, 2, 7, 1, 4, 9, 5 };
		int s = numbers[0];
		int l = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > l) {
				l = numbers[i];
			}
			else if (numbers[i] < s) {
				s = numbers[i];
			}
		}
		System.out.println("Largest Number is : " + l);
		System.out.println("Smallest Number is : " + s);
	}

}
