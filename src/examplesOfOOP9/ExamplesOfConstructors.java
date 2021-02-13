package examplesOfOOP9;

public class ExamplesOfConstructors {
	int x; // Create a class attribute
	
	int a;
	
	 int modelYear;
	  String modelName;

	// Create a class constructor for the Main class
	public ExamplesOfConstructors() {
		x = 4; // Set the initial value for the class attribute x
	}
	
	public ExamplesOfConstructors(int b) {
		a = b; 
	}
	
	public ExamplesOfConstructors(int year, String name) {
		modelYear = year;
	    modelName = name; 
	}

	public static void main(String[] args) {
		ExamplesOfConstructors myObj = new ExamplesOfConstructors();												
		System.out.println(myObj.x); 
		
		ExamplesOfConstructors mySecondObj = new ExamplesOfConstructors(5);
	    System.out.println(mySecondObj.a);
	    
	    ExamplesOfConstructors myCar = new ExamplesOfConstructors(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	}

}
