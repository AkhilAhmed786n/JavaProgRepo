package stringProg;

public class RevUniqCharProg {
	public static void main(String[] args) {
		String s="apPle";
		String s1 = s.toLowerCase();
		
		
		for (char ch='a';ch<='z';ch++) {
			int count =0;
			for (int i = 0; i <s1.length(); i++) {
				
				if (s1.charAt(i)==ch) {
					count++;
				}
			}
			
			if (count>0) {
				System.out.println(ch+" ch count is "+count);
			}
		}
	
	}
}
