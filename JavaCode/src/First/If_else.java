package First;
import java.util.Scanner;


public class If_else {

	public static void main(String[] args) {
		
		int password;
		
		System.out.println("Enter the password: ");
		Scanner s=new Scanner(System.in);
		
		password=s.nextInt();
		
		if(password==1234) {
			System.out.println("your password was correct!!!");
			
		}else {
			System.out.println("You Entered a wrong password");
		}
		
	}

}
