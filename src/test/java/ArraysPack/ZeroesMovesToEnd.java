package ArraysPack;

import java.util.Arrays;
import java.util.Iterator;

public class ZeroesMovesToEnd {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,0,3,0,56,3,0,45,32,0};
		int count=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]!=0) 
			{
				a[count++]=a[i];
			}
		}
		
		while(count<a.length)
		{
			a[count++]=0;
		}
		
//		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+", ");
			
		}
	}

}
