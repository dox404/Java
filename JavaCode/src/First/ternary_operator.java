//find the biggest number using ternary operator



package First;

public class ternary_operator {
	
	public static void main(String args[]) {
		
		int a=10;
		int b=20;
		int c =100;
		int r;
		r=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.print(r);


	}
}
