package collectionProg;

import java.util.TreeSet;

public class TreesetProg {
	
	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<String>();
		
		t.add("yameen");
		t.add("maheen");
		t.add("neelu");
		t.add("Yaseen");
//		t.add(136);		//java.lang.ClassCastException
//		t.add(null;)	//java.lang.NullPointerException
		
		System.out.println(t);
		
		t.clone();
		System.out.println(t);
		
		t.comparator();
		System.out.println(t);
	}

}
