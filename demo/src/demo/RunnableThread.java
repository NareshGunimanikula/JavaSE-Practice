package demo;

public class RunnableThread {

	public static void main(String[] args) {
		ThredCode tc = new ThredCode();
		Thread t = new Thread(tc);
		t.start();

		for(int i =1; i <= 50; i++) {
			System.out.println("Main : " + i);
		}
	}

}

class ThredCode implements Runnable{
	public void run() {
		for(int i =0; i <= 50; i++) {
			System.out.println(i);
		}
	}
}
