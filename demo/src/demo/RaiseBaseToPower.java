package demo;

import java.util.Scanner;

public class RaiseBaseToPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Base Value: ");
		int a = input.nextInt();
		System.out.print("Enter Power Value: ");
		int b = input.nextInt();
		int result = 1;
		for(int i = 1; i <= b; i++) {
			result *= a;
		}
		System.out.print(result);
	}

}
