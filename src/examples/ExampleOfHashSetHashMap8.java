package examples;

import java.util.HashMap;
import java.util.HashSet;

public class ExampleOfHashSetHashMap8 {
	public static void main(String[] args) {
//		example1();
		example2();
	}

//	hashset implements set interface from Collection framework
//	A HashSet is a collection of items where every item is unique, and it is found in the java.util package
	public static void example1() {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
//	    In the example above, even though BMW is added twice it only appears 
//	    once in the set because every item in a set has to be unique.

//	    hashset methods
		cars.contains("Mazda");
		cars.remove("Volvo");
//		cars.clear();
		cars.size();

		for (String i : cars) {
			System.out.println(i);
		}

	}
	
//	A HashMap, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
	public static void example2() {
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    capitalCities.get("England");
	    capitalCities.remove("England");
//	    capitalCities.clear();
	    capitalCities.size();
	    
//	    Loop Through a HashMap
	 // Print keys
	    for (String i : capitalCities.keySet()) {
	      System.out.println(i);
	    }
	    
	 // Print values
	    for (String i : capitalCities.values()) {
	      System.out.println(i);
	    }
	    
	 // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + ", value: " + capitalCities.get(i));
	    }
	}

}
