package ArraysPack;

import java.util.Arrays;

public class MaxAndMinArray {
	
	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,1,9,45,78,98,16};
		int temp=0;
		
//		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		
		//Max of array
		System.out.println(a[a.length-1]);
		
		//Min of array		
		System.out.println(a[0]);
		
	}

}