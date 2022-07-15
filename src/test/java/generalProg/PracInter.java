package generalProg;

public class PracInter {
	
	public static void main(String[] args) {
		
		String s="ba@b#c!d^";
		String s2="";
		
//		StringBuilder alpha=new StringBuilder();
//				
//				for(int i=0;i<s.length()-1;i++)
//				{
//						if (Character.isAlphabetic(s.charAt(i))) 
//						{
//							alpha.append(s.charAt(i));							
//						}			
//				}	
//				System.out.println(alpha);	
		
		for (char ch='a';ch<='z';ch++) {
			for (int i = 0; i<s.length(); i++) {
				if (s.charAt(i)==ch) {
					System.out.print(s.charAt(i));
				}
			}
		}
		
//		for (int i = 0; i < s.length(); i++) {
//			
//			if (Character.isAlphabetic(s.charAt(i))) 
//			{
//					
//			s2=s2+s.charAt(i);	
//			
//			}
//		}
//		System.out.println(s2);
	}

}
