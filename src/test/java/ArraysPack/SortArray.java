
package ArraysPack;
//10

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

//		int a[] = { 5, 3, 6, 2, 1 };
//		int temp;
//
////		Arrays.sort(a);
//
////		System.out.println(Arrays.toString(a));
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] < a[j]) {
//					
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//
//				}
//			}
//		}
//.
//		10.
		
//		System.out.println(Arrays.toString(a));

		int[] a={8,99,67,2,66,45,98,34,36,54,11,24};
        int temp;
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
	}

}
