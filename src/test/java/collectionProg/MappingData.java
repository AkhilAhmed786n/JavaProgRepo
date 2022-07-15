package collectionProg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class MappingData {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(18, "pavan");
		hm.put(15, "soumyasahoo");
		hm.put(12, "divya");
		hm.put(26, "Akhil");
		
//		System.out.println(hm);
		
		Iterator<Integer> it=hm.keySet().iterator(); 
		
//		while(it.hasNext()) 
//		{
//			System.out.println(it.next());
//		}
	}

}
