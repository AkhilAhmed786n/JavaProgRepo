package taskG;

public class RevWordInSentence {
	
	public static void main(String[] args) {
		
		String s="Test Yantra Office in Bangalore";
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			
			String st = str[i];
			String rev="";
			
			for (int j = st.length()-1; j >=0 ; j--) {
				rev=rev+st.charAt(j);
			}
			System.out.println("reverse of "+st+" is "+rev);
		}
	}

}
