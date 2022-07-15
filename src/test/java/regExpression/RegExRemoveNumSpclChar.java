package regExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import patterns.Pattern1;

public class RegExRemoveNumSpclChar {
	
	public static void main(String[] args) {
		 String s="Akhil@786.in";
		 
		 String regex="[^a-zA-z0-9][0-9]{0,13}";
		 
		 Pattern pattern1=Pattern.compile(regex);
		 Matcher matcher1=pattern1.matcher(s);
		 String str = matcher1.replaceAll("");
		 System.out.println(str);
	}

}
