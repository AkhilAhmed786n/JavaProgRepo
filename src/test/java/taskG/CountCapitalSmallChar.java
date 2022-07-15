package taskG;

public class CountCapitalSmallChar {
	public static void main(String[] args) {
		String s = "TesTyAntrA";
		int count1=0;
		int count2=0;

		for (int i = 0; i < s.length(); i++) {
			
			if (Character.isUpperCase(s.charAt(i))) {
				count1++;
			}
			else
			{
				count2++;
			}
			
		}
		System.out.println("upper case count is "+count1);
		System.out.println("lower case count is "+count2);
	}
}
