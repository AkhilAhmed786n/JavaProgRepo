package ArraysPack;

public class SumAndAvgOfArray {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		int avg=0;
	
		for (int i = 0; i < a.length; i++) {
			
			sum=sum+a[i];
			
		}
		System.out.println("sum of array is "+sum);
		
		System.out.println("avg of array is "+(sum/a.length));
	}

}
