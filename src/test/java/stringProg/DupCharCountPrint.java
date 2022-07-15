package stringProg;

public class DupCharCountPrint {

	public static void main(String[] args) {

		String s = "Automation Tester";
		String s2 = s.toLowerCase();
//		char[] s1 = s2.toCharArray();

		String duplChars = "";

		for (int i = 0; i < s2.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s2.length(); j++) {
				if (s2.charAt(i) == s2.charAt(j)) {
					count++;
				}
			}
			if (count ==1) {
				duplChars = duplChars + s2.charAt(i);
			}
			if (count > 0) {
				System.out.println("count of " + s2.charAt(i) + " is " + count);
			}
		}
		System.out.println("duplicate characters are " + duplChars);

	}

}
