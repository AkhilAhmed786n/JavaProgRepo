package taskG;

public class OccOfCharString {
	public static void main(String[] args) {
		
		String s="TestYantra";
		String str=s.toLowerCase();
		
		
		for (char ch='a';ch<='z';ch++) {
			int count=0;
			for (int i = 0; i < str.length(); i++) {
				if (ch==str.charAt(i)) {
					count++;
				}
			}
			if (count>0) {
				System.out.println(ch+" count is "+count);
			}
		}
	}

}
