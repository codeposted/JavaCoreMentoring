package examplesOfOOP9;

public class ExamplesOfEncapsulation {
//	The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.

	private String name; // private = restricted access

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String newName) {
		this.name = newName;
	}

	public static void main(String[] args) {
		ExamplesOfEncapsulation myObj = new ExamplesOfEncapsulation();
		myObj.setName("John"); // Set the value of the name variable to "John"
		System.out.println(myObj.getName());
	}
}
