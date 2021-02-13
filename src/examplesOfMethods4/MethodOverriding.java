package examplesOfMethods4;

public class MethodOverriding {

	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
	
		System.out.println("Area is :" + f.area());
	
		System.out.println("Area is :" + r.area());

	}

}
