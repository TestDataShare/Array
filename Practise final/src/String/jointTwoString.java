package String;

public class jointTwoString {

	public static void main(String[] args) {
		// "+" Operator: add two strings using BODMAS rule. (Bracket of, division, multiplication, addition, subtraction)
		// sopln("test"+10-5) --  provides error 
		// 2. concat operator: join two strings.  returns String
		String s1= "java";
		String s2=" by Referece of";
		System.out.println(s1.concat(s2));
        // 3. join : join is the static method in java. syntax: string.join(delimiter, elements)
		System.out.println(String.join(":",s1,s2));
		// 4. Subsequence:
		String s3= "Here is the latest book of law";
		System.out.println(s3.subSequence(2, 7));
		// 5. Substring: 
		System.out.println(s3.substring(6));
		System.out.println(s3.substring(2, 7));
	}

}
