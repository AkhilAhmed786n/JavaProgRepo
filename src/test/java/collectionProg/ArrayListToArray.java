package collectionProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Akhil");
		al.add("Arun");
		al.add("Noor");
		al.add("Pranesh");
		al.add("Stephen");
		al.add("Chetna");
		al.add("Akshay");
		al.add("Sonia");
		al.add("Mouli");
		
//		System.out.println(al);
//		--------------------------------------
		
//		Iterator<String> it=al.iterator();
//		
//		while(it.hasNext()) 
//		{
//			System.out.println(it.next());
//		}
		
//		-------------------------------------------
		String s[]=new String[al.size()];
		for (int i = 0; i < al.size(); i++) 
		{
			
			s[i]=al.get(i);
		}
		
		System.out.println(Arrays.toString(s));
		
//		---------------------------------------------
		for (int i = 0; i < s.length; i++) 
		{
			
			System.out.print(s[i]+", ");
		}
		
	}

}
