package practice;

public class DupCharCount {

	public static void main(String[] args) {

		String str = "apPle";
		String s1 = str.toLowerCase();
		char[] s = s1.toCharArray();
		String str2 = "";
		String str3 = "";
		

		for (char ch = 'a'; ch <= 'z'; ch++) {

			int count = 0;
			for (int i = 0; i < s.length; i++) {

				if (ch == s[i]) {
					count++;

				}
				if (count == 1 && ch == s[i]) {
					str2 = str2 + s[i];
				}

			}
			if (count > 0) {
				System.out.println(ch + " count is " + count);
			}

		}
		System.out.println(str2);
//		char[] ss = str2.toCharArray();
//		for (int i = 0; i < s.length; i++) {
//			for (int j = 0; j < ss.length; j++) {
//
//				if (s[i]==ss[j]) {
//
//					str3 = str3 + s[i];
//				}
//			}
//		}
//		System.out.println(str3);

	}
}