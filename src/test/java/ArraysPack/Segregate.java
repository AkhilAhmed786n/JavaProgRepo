package ArraysPack;

import java.util.Arrays;

public class Segregate {
	
	//Segregate means separating odd and even numbers
	
	public static void main(String[] args) {
		
		int a[]= {12,7,9,0,23,4};
		System.out.println("Before segregate:--------");
		System.out.println(Arrays.toString(a));
		
		int left=0, right=a.length-1, temp;
		
		while(left<right)
		{
			while(a[left]%2 ==0)
			{
				left++;
			}
			while(a[right]%2!=0)
			{
				right--;
			}
			if (left<right) 
			{
				temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
		
		System.out.println("Array After segragation:--------");
		System.out.println(Arrays.toString(a));
	}

}
