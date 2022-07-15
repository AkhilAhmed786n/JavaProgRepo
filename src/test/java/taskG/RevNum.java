package taskG;

public class RevNum {
	
	public static void main(String[] args) {
		int num=14321,rem,rev=0;
		int b=num;
		
		while (num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10 +rem;
		}
		System.out.println("reverse of number is "+rev);
	}

}
