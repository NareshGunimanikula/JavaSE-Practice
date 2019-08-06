package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 1; i<=5; i++) {
			try {
				int n = Integer.parseInt(s.nextLine());
				sum += n;
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("InputMismatchException");
			}catch(NumberFormatException n) {
				System.out.println("NumberFormatException");
			}
			
		}
		System.out.println(sum);

	}

}
