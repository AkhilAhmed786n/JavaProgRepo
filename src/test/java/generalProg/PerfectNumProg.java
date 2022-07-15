package generalProg;

public class PerfectNumProg {

	public static void main(String[] args) {

		/*
		 * Perfect Number is like sum of numbers which are divisible by given is equal
		 * to the given number 28 number is divisible by 1,2,4,7,14 sum of 1+2+4+7+14 is
		 * 28.
		 */

		int num = 28;
		int sum = 0;

		for (int i = 1; i < 28; i++) {
			if ((num % i) == 0) {
				sum = sum + i;
			}

		}
		if(sum==num)
		{
			System.out.println(num+" is a perfect Number because it is equal to "+sum);
		}
		else {
			System.out.println(num+" is not a perfect number because it is not equal to "+sum);
		}
	}
}
