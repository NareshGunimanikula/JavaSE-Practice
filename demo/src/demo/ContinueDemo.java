package demo;

public class ContinueDemo {

	public static void main(String[] args) {
		continueDemo();
		for(int i =0; i< 2; i++) {
			for(int j = 0; j < 2; j++) {
				if(j<i) {
					continue;
				}
				System.out.println("i = " + i);
				System.out.println("j = " + j);
			}
		}
		int i = 10;
		System.out.printf("%d",i);
	}

	public static void continueDemo() {
		for(int i =0; i<10; i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
