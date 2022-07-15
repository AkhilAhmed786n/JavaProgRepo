package collectionProg;

import java.util.Iterator;

public class SeparateNumAlphabetsSpcl {

	public static void main(String[] args) {

		String s = "akhil786ahmed@gmail.123com";
		StringBuffer alp = new StringBuffer(), num = new StringBuffer(), spcl = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
//				System.out.println("Alphabets are : "+s.charAt(i));
				alp.append(s.charAt(i));

			} else if (Character.isDigit(s.charAt(i))) {
//				System.out.println("numbers are : "+s.charAt(i));
				num.append(s.charAt(i));
			} else {
				spcl.append(s.charAt(i));
			}
		}
		

			System.out.println(alp);
			System.out.println(num);
			System.out.println(spcl);
		
	}

}
