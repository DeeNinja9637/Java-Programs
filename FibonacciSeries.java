package deepak.pack;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num1,num2,num3,Lnum;
		num1 = 1;
		num2 = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Last NUM:");
		Lnum = sc.nextInt();
		System.out.print(num1+" "+num2);
		for(int i=1;i<=Lnum-2;i++) {
			num3 = num1 + num2;
			System.out.print(" "+num3);
			num1 = num2;
			num2 = num3;
		}
		sc.close();

	}

}
