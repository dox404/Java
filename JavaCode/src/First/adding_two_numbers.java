
package First;
import java.util.Scanner;


public class adding_two_numbers {
	public static void main(String args[]) {
		int a,b,c;
		System.out.println("Enter any two numbers:");
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
//		d=s.nextInt();
		c=a+b;
		System.out.println("sum of two numbers: "+c);
		
	}
}
