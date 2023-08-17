package deepak.pack;

import java.util.Scanner;

public class AreaFig {

	public static void main(String[] args) {
		
          int choice;
          double n1,n2,ans;
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("*****Area of Different Figures******");
          System.out.println("1. Area of Reactangle ");
          System.out.println("2. Area of Square ");
          System.out.println("3. Area of Triangle ");
          System.out.println("4. Area of Circle ");
          
          System.out.println("Please enter your choice");
          choice = sc.nextInt();
          
          switch(choice) {
          case 1: System.out.println("Enter length and breadth of Reactangle");
                 n1=sc.nextDouble();
                 n2=sc.nextDouble();
                 
                 ans=n1*n2;
                System.out.println("Area of reactangle="+ans);
                break;
          case 2: System.out.println("Enter side of a sqauare");
          n1=sc.nextDouble();
               ans=n1*n1;
               System.out.println("Area of square="+ans);
                break;
          case 3: System.out.println("Enter base and height of a triangle");
                     n1=sc.nextDouble();
                     n2=sc.nextDouble();
                     
                     ans=(n1*n2)/2;
                     System.out.println("Area of triangle ="+ans);
                     break;
          case 4: System.out.println("Enter radius of a circl3");
                     n1=sc.nextDouble();
                     ans = 3.14159*n1*n1;
                     System.out.println("Area of circle="+ans);
                     break;
           default: System.out.println("invalid input");
          }
	}

}
