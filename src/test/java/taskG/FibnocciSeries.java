package taskG;

public class FibnocciSeries {
	public static void main(String[] args) {
		int a=0,b=1,c;
		
		for (int i = 0; i < 10; i++) {
			
			c=a+b;
			b=a;
			a=c;
			System.out.print(c+" ");
		}
		
	}
}
