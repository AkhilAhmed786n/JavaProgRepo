package stringProg;

public class ReverseProg {
	
	public static void main(String[] args) {
		
		String s="TestYantra";
		 char[] c = s.toCharArray();
		String rev="";
		
//		for (int i = s.length()-1; i >=0; i--) 
//		{
//		
//			System.out.print(s.charAt(i));
//		}
		
		for (int i = c.length-1; i >=0 ; i--) {
			
			System.out.print(c[i]);
		}
	}

}
