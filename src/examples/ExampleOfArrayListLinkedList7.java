package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ExampleOfArrayListLinkedList7 {

	public static void main(String[] args) {
//		example1();
		example2();
	}

//	example 1, Java Collection Frameworks has interfaces like List, Set ..; ArrayList is a class of List interface; 
	public static void example1() {
//		
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		cars.get(0);

		cars.set(0, "Opel");
		System.out.println(cars);

		cars.remove(0);
//		cars.clear();
		cars.size();
	}

//	example 2, Loop through the elements of an ArrayList
	public static void example2() {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

//	    for loop
//		for (int i = 0; i < cars.size(); i++) {
//			System.out.println(cars.get(i));
//		}

//	    for each loop
		for (String i : cars) {
			System.out.println(i);
		}

//		Another useful class in the java.util package is the Collections class,
//		which include the sort() method for sorting lists alphabetically or numerically:

		Collections.sort(cars); // Sort cars

		for (String i : cars) {
			System.out.println(i);
		}
	}
	
//	example 3, The LinkedList class is almost identical to the ArrayList
	public static void example() {
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
//	    the LinkedList provides several methods to do certain operations more efficiently:
	    cars.addFirst("Mazda");
	    cars.addLast("Mazda");
	    cars.removeFirst();
	    cars.removeLast();
	    cars.getFirst();
	    cars.getLast();
	}
	
}
