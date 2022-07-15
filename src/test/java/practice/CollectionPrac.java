package practice;

import java.util.HashMap;

public class CollectionPrac {
	
	public static void main(String[] args) {
		
		HashMap hm= new HashMap();
		hm.put("akhil", "Automation tester");
		
		System.out.println(hm.get("akhil"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
	}

}
