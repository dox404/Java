package First;

public class second {
	int n=10;// instance variable
	
	static double d=23.5; // static variable
	public static void main(String args[]) {
		boolean c=true; //local variable
		second i=new second();
		System.out.println(i.n); //printing the instance variable
		System.out.println(d);
		System.out.println(c);
	}

}
