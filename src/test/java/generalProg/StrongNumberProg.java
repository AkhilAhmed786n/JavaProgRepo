package generalProg;

import java.util.Iterator;

public class StrongNumberProg {
	public static void main(String[] args) {

		/*
		 * Strong numbers are those numbers whose sum of factorial of each digits is
		 * equal to the original number. example : 145 ====> 1!+4!+5! = 1+ 24+ 120 =145
		 */

		int num = 145;
		int sum = 0;
		int fact = 1, rem, backup = num;

		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			fact = 1;
		}
		if (backup == sum) {
			System.out.println(backup + " is a strong number");
		} else {
			System.out.println(backup + " is not a strong number");
		}
	}
}
