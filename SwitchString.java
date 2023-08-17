package deepak.pack;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		String day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day:");
		day = sc.nextLine().toLowerCase();
		
		switch(day) {
		case "monday":
			System.out.println("First day of the week");
			break;
		case "tuesday":
			System.out.println("Second day of the week");
			break;
		case "wednesday":
			System.out.println("Third day of the week");
			break;
		case "thursday":
			System.out.println("Fourth day of the week");
			break;
		case "friday":
			System.out.println("Fifth day of the week");
			break;
		case "saturday":
			System.out.println("Sixth day of the week");
			break;
		case "sunday":
			System.out.println("Seventh day of the week");
			break;
		default:
			System.out.println("Invalid Input");
		sc.close();
		}
	}
}
