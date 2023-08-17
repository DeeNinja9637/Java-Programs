package deepak.pack;

import java.util.Scanner;

public class SwitchCharachter {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a vowel:");
		ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A':
			System.out.println(ch + " is a Vowel");
			break;
		case 'a':
			System.out.println(ch + " is a Vowel");
			break;
		case 'E':
			System.out.println(ch + " is a Vowel");
			break;
		case 'e':
			System.out.println(ch + " is a Vowel");
			break;
		case 'I':
			System.out.println(ch + " is a Vowel");
			break;
		case 'i':
			System.out.println(ch + " is a Vowel");
			break;
		case 'O':
			System.out.println(ch + " is a Vowel");
			break;
		case 'o':
			System.out.println(ch + " is a Vowel");
			break;
		case 'U':
			System.out.println(ch + " is a Vowel");
			break;
		case 'u':
			System.out.println(ch + " is a Vowel");
			break;
		default:
			System.out.println("Not a Vowel");
		
		sc.close();
		
		}
		

	}

}
