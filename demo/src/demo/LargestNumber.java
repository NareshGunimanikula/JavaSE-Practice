package demo;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int largeNumber = 0;
		for(int i = 1; i<=10; i++) {
			System.out.print("Enter " + i + " number ");
			int num = input.nextInt();
			if(num > largeNumber) {
				largeNumber = num;
			}
		}
		System.out.print(largeNumber);
		
		
	}

}
