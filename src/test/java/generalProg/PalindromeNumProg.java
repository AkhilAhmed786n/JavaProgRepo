package generalProg;

public class PalindromeNumProg {
	
	public static void main(String[] args) {
		
		int num=14341,rem,rev=0;
		int backup=num;
		
		while (num>0)
		{
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
		}
		
		if (backup==rev) 
		{
			System.out.println(rev+" is a palindrome number");
		}
		else
		{
			System.out.println(rev+" is not a palindrome number");
		}
	}

}
