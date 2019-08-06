package demo;

import java.util.Scanner;

public class FactorsClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = s.nextInt();
		for(int i =2; i<= num/2; i++) {
			if(num%i == 0) {
				System.out.println(i);
			}
		}
	}

}
