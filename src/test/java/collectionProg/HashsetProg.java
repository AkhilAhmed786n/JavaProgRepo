package collectionProg;

import java.util.HashSet;
import java.util.Iterator;


public class HashsetProg {

	public static void main(String[] args) {

		HashSet<String> t = new HashSet<String>();

		t.add("yameen");
		t.add("maheen");
		t.add("neelu");
		t.add("Yaseen");
		
//		System.out.println(t);
		
		if (t.contains("neelu")) 
		{
			System.out.println("neelu is present");
		}
		
		Iterator<String> it=t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for (String st : t) 
		{
			System.out.print(st+", ");
		}
	}

}
