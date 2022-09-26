package First;

import java.util.Scanner;
//printing table of a number upto 10
public class for_loop {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number: ");
		Scanner s=new Scanner(System.in);
		
		n=s.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	
	}

}
