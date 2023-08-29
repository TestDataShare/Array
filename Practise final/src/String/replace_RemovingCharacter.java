package String;

public class replace_RemovingCharacter {

	public static void main(String[] args) {
		//1. replace(String , String replacement) : replace all the regex in replace word.
		String s1 = "This is my name is";
		System.out.println(s1.replace("is", "Was"));
		// 2. replaceFirst(String , String replacement):
		System.out.println(s1.replaceFirst("is", "Hey"));
		// 3. replaceAll(String regex, String replacement)
		System.out.println(s1.replaceAll("is", "ok"));
		// 4. replaceAll(String  regex, String replacement)
		System.out.println(s1.replaceAll("is(.)", "yes"));  // change all the word and then removing the spaces
		System.out.println(s1.replaceAll("is(.*)", "us")); // from first regex next all char is deleted. And only shown till first. 
	}

}
