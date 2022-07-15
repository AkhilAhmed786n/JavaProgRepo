package collectionProg;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ListsToMap {
	
	public static void main(String[] args) {
		
		 List<String> al = new ArrayList<String>();
		al.add("Akhil");
		al.add("Arun");
		al.add("Noor");
		al.add("Pranesh");
		
		List<Integer> a2 = new ArrayList<Integer>();
		a2.add(1);
		a2.add(2);
		a2.add(4);
		a2.add(3);
		
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		for (int i = 0; i < a2.size(); i++) 
		{
		
		tm.put(a2.get(i), al.get(i));
		}
		System.out.println(tm);
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		
//		---------------------------------------
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		for (int i = 0; i < a2.size(); i++) 
		{
		
		hm.put(a2.get(i), al.get(i));
		}
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
//		System.out.println(hm.get("username"));
		
//		-----------------------------------------------
		
		Set<Entry<Integer, String>> s=hm.entrySet();
		
		Iterator<Entry<Integer, String>> it=s.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println(hm.size());

		
		for (int i = 1; i<hm.size()+1; i++) 
		{
			System.out.println(hm.get(i));
		}
		
//		for (String a : hm) 
//		{
//			System.out.println(a);
//		}
		
		
	}

}
