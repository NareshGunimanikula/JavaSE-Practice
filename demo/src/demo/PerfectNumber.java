package demo;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		int sum=0;
		for(int i = 1; i <= num/2; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		if(sum == num) {
			System.out.print("Perfect Number");
		}
		else {
			System.out.print("Not Perfect Number");
		}
	}

}
