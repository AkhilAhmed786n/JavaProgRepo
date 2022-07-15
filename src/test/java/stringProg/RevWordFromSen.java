package stringProg;

public class RevWordFromSen {
	
	public static void main(String[] args) {
		
		String s="test yantra office";
		String[] s1 = s.split(" ");
				
		for (int i =0 ; i < s1.length; i++) {
			
			String s2 = s1[i];
			String rev="";
			for (int j = s2.length()-1; j >=0 ; j--) 
			{
				rev=rev+s2.charAt(j);			
				
			}
			System.out.println("rev is "+rev);
		}
		
	}

}
