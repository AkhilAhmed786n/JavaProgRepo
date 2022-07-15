package generalProg;

public class ArmstrongProg {
	
	public static void main(String[] args) {
		
		int num=1634,
		newnum=num;
		int rem, rev=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev= rev+(rem*rem*rem*rem);
		}
		
		if(newnum==rev)
		{
			System.out.println(newnum+" is Armstrong number");
		}
		else
		{
			System.out.println(newnum+" is not Armstrong number");
		}
	}

}
