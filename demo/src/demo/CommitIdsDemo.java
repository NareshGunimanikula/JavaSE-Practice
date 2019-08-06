package demo;

import java.time.LocalTime;
import java.util.Date;

public class CommitIdsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] commitIds = { 123, 127, 130, 137, 154,258,268,890,754,658,460,892,569,111,123,456 };
		LocalTime myObj = LocalTime.now().plusHours(2);
		for (int i : commitIds) {
			{

				if (executeTests(i) == false && LocalTime.now().isBefore(myObj)) {
					System.out.println(i);
				}
			}
		}
	}

	private static boolean executeTests(int i) {
		// TODO Auto-generated method stub
		return (i == 137) ? false : true;
	}

}
