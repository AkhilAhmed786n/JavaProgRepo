package practice;

public class Prac {
	
	public static void main(String[] args) {
		
		String s="akhilahmed";
		char[] s1 = s.toCharArray();
		
		for (char ch='a';ch<'z';ch++) {
			int count=0;
			for (int i = 0; i < s1.length; i++) {
				if (ch==s1[i]) {
					count++;
				}
			}
			if(count>0)
			System.out.println(ch+"===>"+count);
		}
	}

}
