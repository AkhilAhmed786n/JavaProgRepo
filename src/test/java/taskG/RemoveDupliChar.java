package taskG;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDupliChar {
	public static void main(String[] args) {
		String s="batball";
		char[] ss = s.toCharArray();
		
		LinkedHashSet s1=new LinkedHashSet();
		
		for (char s2 : ss) {
			s1.add(s2);
		}
		
		System.out.println(s1);
		
	}
}
