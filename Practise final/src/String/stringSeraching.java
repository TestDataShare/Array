package String;

public class stringSeraching {

	public static void main(String[] args) {
		// 1. indexOf():either user can provide character or string. return the integer value.
		String s1 = "Hi i am going to office";
		int i1 = s1.indexOf('t');
		System.out.println(i1);
		int i2 = s1.indexOf("going");
		System.out.println(i2);
		// 2. lastIndexOf():either user can provide character or string. return the integer value. It will search the string or char from last of string.
		int i3=s1.lastIndexOf('o');
		System.out.println(i3);
		int i4 = s1.lastIndexOf("to");
		System.out.println(i4);
		// 3. charAt(): return the value form of String. User provide the index number.
		char st1 = s1.charAt(6);
		System.out.println(st1);
		char st2 = s1.charAt(14);
		System.out.println(st2);
		// 4. contains("String name"): return the value in form of boolean.This word is present or not.
		boolean b1= s1.contains("am");
		System.out.println(b1);
		boolean b2= s1.contains("vishal");
		System.out.println(b2);
		// 5. startWith(): return the boolean value. 
		boolean b3 = s1.startsWith("a");
		System.out.println(b3);
		boolean b4 = s1.startsWith("H");
		System.out.println(b4);
		// 6. endsWith():  return the boolean value. 
		boolean b5 = s1.endsWith("to");
		System.out.println(b5);
		boolean b6 = s1.endsWith("e");
		System.out.println(b6);

	}

}
