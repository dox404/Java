package First;

import java.util.Scanner;
//printing table of a number upto 10
public class while_loop {

	public static void main(String[] args) {
		int n;
		int i=1;
		System.out.println("Enter the number: ");
		Scanner s=new Scanner(System.in);
		
		n=s.nextInt();
		
		do {
			System.out.println(n+"x"+i+"="+n*i);
			i++;
		}while(i<=10);
	
	}

}
