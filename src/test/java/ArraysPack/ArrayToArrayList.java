package ArraysPack;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	public static void main(String[] args) {
		
		
		String[] s= {"akhil","sameer","shakeel","neelu"};
		String[] a= new String[s.length];
		
//		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
//		
//		System.out.println("After one is"+al);
//		System.out.println("before one is "+Arrays.toString(s));
//		
//		Another Model
//		-------------------------------
		for (int i = 0; i < s.length; i++) 
		{
			
			a[i]=s[i];
		}
		System.out.println(Arrays.toString(s));
		
	}
}