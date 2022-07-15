package ArraysPack;

import java.util.Arrays;

public class copyArraytoArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 6, 7 };
		int b[] = new int[a.length];
		int count=0;
		
		/*
		 * reverse and copying from array to array
		 */
//		for (int i = b.length-1; i>=0; i--) 
//		{
//			b[count++]=a[i];
//			
//		}
//		
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(a));
		
		/*
		 * copying from one array to another array
		 */
		for (int i = 0; i < b.length; i++) 
		{
			
			b[i]=a[i];
			
		}
		System.out.println(Arrays.toString(b));
		

	}

}
