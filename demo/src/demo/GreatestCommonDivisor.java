package demo;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = input.nextInt();
		System.out.print("Enter second number: ");
		int b = input.nextInt();
		
		int i = a < b? a: b;
		for(; i >0; i--) {
			if(a % i ==0 && b % i == 0) {
				 System.out.print("GCD " + i);
				 break;
			}
		}
		
		
	}

}
