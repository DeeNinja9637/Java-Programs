package deepak.pack;

import java.util.Scanner;

public class FactorsMain {

	public static void main(String[] args) {
		/*int num;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER:");
		num = sc.nextInt();
		
		System.out.println("Factor of "+num+" are: ");
		if(i > 0) {
			for(i = 1; num>=i; i++) {
				if(num%i == 0) {
					System.out.print(i+" ");
				
				}
			}
		}
		else {
			for(int j = -1; num>=j; j--) {
				if(num%j == 0) {
					System.out.print(j+" ");
					}
				}
			}*/
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th number");
		num=sc.nextInt(); //num=6 , 1 2 3 6
		System.out.print("Factors of "+num+ " are :");
		for(int i=1;i<=num;i++) { //6%1, 6%2, 6%3, 6%4 6%5 6%6
			if(num%i == 0) {
				System.out.print(i+" ");
			
			}
		}
		
		}
		}
