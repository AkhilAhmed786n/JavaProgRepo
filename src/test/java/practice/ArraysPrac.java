package practice;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysPrac {
	public static void main(String[] args) {

//		One array to another array

		String[] s = { "Abcd", "efgh", "ijkl", "mnop", "qrst" };

		String[] ss = new String[s.length];

		for (int i = s.length - 1; i >= 0; i--) {
			ss[i] = s[i];
		}
		System.out.println(Arrays.toString(ss));

//		---------------------------------------------------------------------/
//		Sorting and minimum, max values:---
		int[] a = { 11, 18, 98, 15, 54, 67, 48, 95, 35, 62 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("min value from a is " + a[0]);
		System.out.println("second min value from a is " + a[1]);
		System.out.println("max value from a is " + a[a.length - 1]);
		System.out.println("second max value from a is " + a[a.length - 2]);

//		---------------------------------------------------------------------------
//		Max from the above a array
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max value without sorting " + max);

//		-----------------------------------------------------------------------------
//		Moving zeroes to end of the array
		int b[] = { 17, 8, 0, 13, 89, 65, 0, 78, 0, 99 };
		int count = 0;

		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				b[count] = b[i];
				count++;
			}
		}
		while (count < a.length) {
			b[count] = 0;
			count++;
		}
		System.out.println(Arrays.toString(b));
//		-----------------------------------------------------------------------------
//		Segregate of array with 0 and 1

		int[] c = { 0, 1, 1, 0, 1, 0, 0, 1, 0, 1 };
		System.out.println("Before segregate" + Arrays.toString(c));
		int left = 0, right = c.length - 1;

		while (left < right) {
			while (c[left] == 0 && left < right) {
				left++;
			}
			while (c[right] != 0 && left < right) {
				right--;
			}
			if (left < right) {
				c[left] = 0;
				c[right] = 1;
				left++;
				right--;
			}
		}
		System.out.println("After segregate:--" + Arrays.toString(c));
//		-----------------------------------------------------------------------------
//		segregate of array with even and odd numbers

		int ar[] = { 11, 15, 16, 6, 48, 99, 65, 44,0 };
		int left1 = 0, right1 = ar.length - 1, tem;
		
		System.out.println("Before segregate "+Arrays.toString(ar));

		while (left1 < right1) {
			while (ar[left1]%2 == 0) {
				left1++;
			}
			while (ar[right1]%2!=0) {
				right1--;
			}
			if (left1<right1) {
				tem=ar[left1];
				ar[left1]=ar[right1];
				ar[right1]=tem;
				left1++;
				right1--;
			}
		}
		System.out.println("After segregate "+Arrays.toString(ar));
//		--------------------------------------------------------------------------------
//		Sum and Avg of array
		
		int[] some= {2,4,6,10,16,20,12};
		int sum=0;
		
		for (int i = 0; i < some.length; i++) {
			sum=sum+some[i];
		}
		System.out.println("Sum of array"+Arrays.toString(some)+" is "+sum);
		System.out.println("Avg of array"+Arrays.toString(some)+" is "+sum/some.length);
//		------------------------------------------------------------------------------------
//		Sum of even index and odd index
		
		int p[]= {0,2,0,4,0,6,0,8,0,10,1};
		int summ=0,odd=0;
		
		for (int i = 0; i < p.length; i++) {
			if (i%2==0) {
				summ=summ+p[i];
			}
			if (i%2!=0) {
				odd=odd+p[i];
			}
		}
		System.out.println("Sum of even index is "+summ);
		System.out.println("Sum of odd index is "+odd);
//		------------------------------------------------------------------------------
		
	}
}
