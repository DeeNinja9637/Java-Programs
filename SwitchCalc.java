package deepak.pack;
import java.util.Scanner;

public class SwitchCalc {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int a,b,c,t;
		System.out.println("Enter the value of a:");
		a = sc.nextInt();
		System.out.println("Enter the value of b:");
		b = sc.nextInt();
		
		System.out.println("Enter 1 for Additon");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		c = sc.nextInt();
		
		
		switch (c) {
		case 1:
			t = a+b;
			System.out.println("Addition of "+a+" and "+b+" is: "+t);
			break;
		case 2:
			t = a-b;
			System.out.println("Subtraction of "+a+" and "+b+" is: "+t);
			break;
		case 3:
			t = a*b;
			System.out.println("Multiplication of "+a+" and "+b+" is: "+t);
			break;
		case 4:
			if (b!=0) {
				t = a/b;
				System.out.println("Division of "+a+" and "+b+" is: "+t);
			}
			else {
				System.out.println("divisor is zero so can't divide");
			}
			break;
		default:
			System.out.println("INVALID INPUT");
		sc.close();
		
		}

	}

}
