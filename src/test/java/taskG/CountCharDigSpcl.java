package taskG;

public class CountCharDigSpcl {

	public static void main(String[] args) {
		String s="23ak%$hil@786.com";
		
		StringBuilder alphabets=new StringBuilder(),
					numbers=new StringBuilder(),
					spclChar=new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				alphabets.append(s.charAt(i));
			}
			else if (Character.isDigit(s.charAt(i))) {
				numbers.append(s.charAt(i));
			}
			else {
				spclChar.append(s.charAt(i));
			}
		}
		System.out.println("Alphabets are "+alphabets);
		System.out.println("numbers are "+numbers);
		System.out.println("special characters are "+spclChar);
	}
}
