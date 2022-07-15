package stringProg;

public class Revof1stHlf2Hlf {

	public static void main(String[] args) {

		String s = "Automation";
		String rev1 = "";
		String rev2 = "";
		int half = s.length() / 2;
		for (int i = half; i >= 0; i--) {

			rev1 = rev1 + s.charAt(i);
		}

		for (int i = s.length()-1; i >= half; i--) {
			rev2 = rev2 + s.charAt(i);
		}
		System.out.println(rev1+" "+rev2);
	}
}
