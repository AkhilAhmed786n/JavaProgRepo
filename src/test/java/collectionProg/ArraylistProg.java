package collectionProg;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistProg {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Akhil");
		al.add(1);
		al.add(2.0);
		al.add('Z');
		
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		al.add(2, "ahmed");
		System.out.println(al);
	}

}
