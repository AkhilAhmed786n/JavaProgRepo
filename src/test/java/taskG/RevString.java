package taskG;

public class RevString {
	public static void main(String[] args) {
		String s = "Test Yantra";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
//		-------------------------------------------------------------
//		Palindrome
		
		String str="madam";
		String rev1="";
		for (int i = str.length()-1; i >=0; i--) {
			rev1=rev1+str.charAt(i);
		}
		if (rev1.equals(str)) {
			System.out.println(str+" is a palindrome string");
		}
		else
		{
			System.out.println(str+" is a not a palindrome string");
		}
	}
}
