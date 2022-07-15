package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapProgPrac {
	
	/*
	 * Different ways to iterate a Map
	 */

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(10, "Akhil");
		m.put(11,"Mahesh");
		m.put(12, "Sujith");
		m.put(13, "Shrikanth");
		m.put(14,"Jaswanth");
		m.put(15, "Girijesh");
		
		for (Map.Entry<Integer, String> hm : m.entrySet()) {
			System.out.println("value of "+hm.getKey()+" key is "+hm.getValue());
		}
//		------------------------------------------------------------------------------
		int count=1;
		for (Integer hm1 : m.keySet()) {
			System.out.print(count+")"+hm1+" ");
			count++;
		}
//		---------------------------------------------------------------------------
		System.out.println("\n");
		int countt=1;
		for (String hm2 : m.values()) {
			System.out.print(countt+")"+hm2+" ");
			countt++;
		}
//		----------------------------------------------------------------------------
		System.out.println("\n");
		Iterator<Map.Entry<Integer, String>> it=m.entrySet().iterator();
		
		while (it.hasNext()) {
			Entry<Integer, String> obj = it.next();
			System.out.println(obj.getKey()+" "+obj.getValue());
		}
//		---------------------------------------------------------------------------
		for (Integer key : m.keySet()) {
			String value = m.get(key);
			System.out.println(key+" "+value);
			
		}
//		---------------------------------------------------------------------------
		
		
	}
}
