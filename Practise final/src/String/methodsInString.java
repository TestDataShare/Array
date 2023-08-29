package String;

public class methodsInString {

	public static void main(String[] args) {
		// 1. length() method: returns the value in integer data.
		String name= "Tesst";
		System.out.println(name.length());
		if(name.length()==0)
		{
			System.out.println("String is Empty");
		}
		else
		{
			System.out.println("String is not Empty");
		}
		
		//2. isEmpty(): it will the return value in boolean format. check whether the string is empty or not.
		String data = "data";
		System.out.println(data.isEmpty());
		
		//3. trim(): it will remove the starting and ending spaces from the string. eg.("  test  "). It will not remove the spaces inside the String. (eg."te  st")
        // returns the output in form of String.
		String test1= "   vishal  ";
		System.out.println(test1.trim());
		String test2 = "  vish  al   ";
		System.out.println(test2.trim());
		
		//4. equals and equalsIgnoreCase(): it will compare contains in the string and gives the output in boolean format.
		String s1= "deepak";
		String s2= "Deepak";
		System.out.println(s1.equals(s2));  // case sensitive 
		System.out.println(s1.equalsIgnoreCase(s2)); // in this it will covert upper to lower case and compare the data in the string.
		
		// 5. compareTo() and compareToIngoreCase(): it will compare the string lexicographically(Convert alphabet into unicode and then subtract it).
		//    Return value in integer format.in case of string it will compare only first letter then ignore all other and subtract it.
		
		String st1 = "a";
		String st2="C";
		System.out.println(st1.compareTo(st2)); // Compare string if s1=s2=0 s1>s2=+  s1<s2=-
		System.out.println(st1.compareToIgnoreCase(st2)); // ignore case convert into lower char then subtract it 
		String st3 = "abc";
		String st4 = "ABC";
		System.out.println(st3.compareTo(st4));
		System.out.println(st3.compareToIgnoreCase(st4));
	}

}
