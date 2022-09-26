package First;
import java.util.Scanner;

public class If_a_single_statement_chek {
	
	public static void main(String args[]) {
		int password;
		System.out.println("Enter your password: ");
		Scanner s=new Scanner(System.in);
		
		password=s.nextInt();
		
		if(password==1234){
			
			System.out.println("Your password was correct");
		}
		
	}

}
