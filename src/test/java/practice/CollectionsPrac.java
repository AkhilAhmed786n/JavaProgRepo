package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsPrac {
	public static void main(String[] args) {
//		ArrayList to Array

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Aakhil");
		ar.add("Sameer");
		ar.add("Shakeel");
		ar.add("Sadiq");

		System.out.println(ar);
//		Iterator<String> it=ar.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		String[] a = new String[ar.size()];
		for (int i = 0; i < ar.size(); i++) {
			a[i] = ar.get(i);
		}
		System.out.println(Arrays.toString(a));
//		----------------------------------------------------------------------------
//		Collections Inbuilt methods
		
		ArrayList al = new ArrayList();
		al.add("Tyss");
		al.add(2022);
		al.add(2.2f);
		al.add(20.22);
		al.add('A');
		System.out.println(al);

		Collections.reverse(al);
		System.out.println("After reversing " + al);

		al.remove(2);
		System.out.println("After removing 2nd index " + al);

		al.add(2, 2.22f);
		System.out.println("after adding in 2nd index " + al);

		al.remove("Tyss");
		System.out.println("After removing a object" + al);

//		------------------------------------------------------------------------------------
//		TreeSet code

		TreeSet<String> tr = new TreeSet<String>();
		tr.add("Mahesh");
		tr.add("Srikanth");
		tr.add("Sujith");
		tr.add("Jaswanth");
		tr.add("Aditya");
		tr.add("Goutham");
		tr.add("Vikram");
		tr.add("Aakhil");

		System.out.println(tr);

		tr.clone();
		System.out.println(tr);

		tr.comparator();
		System.out.println(tr);
//		------------------------------------------------------------------------------------------
//		HashSet code with iterator

		HashSet<String> hs = new HashSet<String>();
		hs.add("Ali");
		hs.add("Riyaz");
		hs.add("Irshad");
		hs.add("Noor");
		hs.add("Shakeer");
		hs.add("Faruk");
		System.out.println(hs);

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

//		for (String ss : hs) {
//			System.out.println(ss);
//		}
//		---------------------------------------------------------------------------------------------
//		List to Map

		List<String> l2 = new ArrayList<String>();
		l2.add("Hyderabad");
		l2.add("Mysore");
		l2.add("Bangalore");
		l2.add("Guntur");
		l2.add("Vijayawada");

		System.out.println(l2);

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(5);
		l1.add(4);
		l1.add(1);
		l1.add(2);
		System.out.println(l1);

		Map<Integer, String> m = new TreeMap<Integer, String>();

		for (int i = 0; i < l1.size(); i++) {
			m.put(l1.get(i), l2.get(i));
		}
		System.out.println(m);
		
		Map<String, Integer> m1=new TreeMap<String, Integer>();
		for (int j = 0; j < l2.size(); j++) {
			m1.put(l2.get(j), l1.get(j));
		}
		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println(m.keySet());
		System.out.println(m.values());
//		-------------------------------------------------------------------------------------
		
	}
}
