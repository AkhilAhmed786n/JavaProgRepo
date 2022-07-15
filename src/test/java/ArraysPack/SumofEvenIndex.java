package ArraysPack;

public class SumofEvenIndex {
	
	public static void main(String[] args) {
		
		int a[]= {11,21,23,35,6,4,768,96,47};
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (i%2==0) 
			{
				sum=sum+a[i];
				System.out.print(a[i]+", ");
			}
		}
		
		System.out.println(sum);
		
	}

}
