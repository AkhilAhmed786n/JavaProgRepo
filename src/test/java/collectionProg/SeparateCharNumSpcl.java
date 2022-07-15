package collectionProg;

public class SeparateCharNumSpcl {
	
	public static void main(String[] args) {
		
		String s="Ty$s*s1%23@";
		StringBuilder alp=new StringBuilder(), dig=new StringBuilder(), spcl=new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				alp.append(s.charAt(i));
			}
			else if (Character.isDigit(s.charAt(i))) {
				dig.append(s.charAt(i));
			}
			else
			{
				spcl.append(s.charAt(i));
			}
		}
		System.out.println(alp);
		System.out.println(dig);
		System.out.println(spcl);
	}

}
