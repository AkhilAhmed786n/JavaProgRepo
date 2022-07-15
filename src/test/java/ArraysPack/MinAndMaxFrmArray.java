package ArraysPack;

import java.util.Arrays;

public class MinAndMaxFrmArray {

	public static void main(String[] args) {

		int a[] = { 3, 4, 2, 6, 5, 9, 1 };
		int b[] = new int[a.length];
		int temp = 0;

//		Arrays.sort(a);
		int size = a.length;
//
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

		System.out.println("min value : " + a[0]);
		System.out.println("max value : " + a[size - 1]);
	}

}
