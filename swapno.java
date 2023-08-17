package deepak.pack;

import java.util.Scanner;

public class swapno {

	public static void main(String[] args) {
	
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Value of a:");
		a = sc.nextInt();
		System.out.println("Value of b:");
		b = sc.nextInt();
		
		System.out.println("Value of a before swap: "+ a);
		System.out.println("Value of b before swap: "+ b);
		
		c = a;
		a = b;
		b = c;
		
				
		System.out.println("Value of a after swap: "+ a);
		System.out.println("Value of b after swap: "+ b);
		sc.close();

	}

}
