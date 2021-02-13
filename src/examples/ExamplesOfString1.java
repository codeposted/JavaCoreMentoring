package examples;

public class ExamplesOfString1 {

	public static void main(String[] args) {
//		example1();

//		example 2
//		String str = "this is Java";
//		System.out.println(removeCharAt(str, 3));
		
//		example 3
		example3();
	}

//	search the last position of a substring 
	public static void example1() {
		String strOrig = "Hello world, Hello Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");

		if (lastIndex == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Last occurrence of Hello is at index " + lastIndex);
		}
	}

//	example 2
//	remove a particular character from a string, substring method of string is used
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}

//	example 3
//	compare two strings
	public static void example3() {
		String s1 = "Java is good";
		String s2 = "Java is good";
		String s3 = new String("Java is good");
		
//		.equals only checks value, == operators for reference comparison (address comparison)
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println("------");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}
}
