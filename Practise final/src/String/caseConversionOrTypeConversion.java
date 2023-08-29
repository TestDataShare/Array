package String;

public class caseConversionOrTypeConversion {

	public static void main(String[] args) {
		/* case conversion
		 * 1. toUpperCase(): convert string into upper case all the string
		 * 2. toLowerCase(): convert string to lower case all the string
		 *  */
   	String s1= "Hi i am going to village";
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
		
		/* Type Conversion
		 * 1. toCharArray(): Convert string to array.
		 * 2. valueOf(): convert any data type data into string format.It is static method.  ex. string.valueOf()
		 * */
		char[] c = s1.toCharArray();
		System.out.println(c);
		
		long l = 56l;
		float f = 56.345465f;
		double d = 435.54546;
		String s2 = String.valueOf(l);
		String s3 = String.valueOf(f);
		String s4 = String.valueOf(d);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
