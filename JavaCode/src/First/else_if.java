package First;

import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
		int password=0000;
		int pwd;
		
		System.out.println("Enter the password: ");
		Scanner s=new Scanner(System.in);
		
		pwd=s.nextInt();
		
		
		if(pwd==password) {
			System.out.println("Password was correct !!");
			
		}else if(pwd==1234) {
			System.out.println("The password is to simple plz try another password");;
		}else {
			System.out.println("Incorrect password!!");
		}

	}

}
