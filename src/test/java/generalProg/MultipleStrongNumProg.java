package generalProg;

public class MultipleStrongNumProg {

	public static void main(String[] args) {

		int num=1000,sum=0,rem, fact=1;
		
		for (int i =100; i <=num; i++) {
			
			while (i>0) {
				rem=i%10;
				i=i/10;
				
				for (int j = 1; j <=rem; j++) {
					fact=fact*j;
					
				}
				sum=sum+fact;
				fact=1;
			}
			if (i==sum) {
				System.out.println(i+" is a strong number");
			}
			else {
				System.out.println(i+" is not a strong number");
			}
			
		}

		
	}

}
