package practice;

public class Practice1 extends Object {

	public static void main(String[] args) {

		String str = "Automation Tester";
		String str1 = str.toLowerCase();
		char[] s = str1.toCharArray();
		String s1="";
		String s2="";
		int countt=0;
		
		
		for (int i = 0; i < s.length; i++) {
			int count=1;
			
			for (int j = i+1; j < s.length; j++) {
				if (s[i]==s[j]) {
					count++;
				}				
				
			}
			
			if (count>0 && s[i]==s[countt++]) {
				s1=s1+s[i];
//				s2=s1;
				
			}
			
			if(count>0 )
			{
				System.out.println("count of "+s[i]+" is "+count);
			}
			
			
		}
		System.out.println(s1);
		
	}
}
