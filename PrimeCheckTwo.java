package deepak.pack;

import java.util.Scanner;
public class PrimeCheckTwo {

	public static void main(String[] args) {
		int num, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th number");
		num=sc.nextInt(); //num=6 , 1 2 3 6
		
		boolean flag = true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) { //
				flag=false;
			}
		}
		
		if(flag) {
			System.out.println(num+" is prime");
		}else {
			System.out.println(num+" is not prime");
		}

	}

}
