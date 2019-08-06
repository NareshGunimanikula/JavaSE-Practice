package demo;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("In Main");
		
		ChildThread ct = new ChildThread();
		ct.start();
		
		for(int i =0; i<= 50; i++) {
			System.out.println("Main Thread is : " + i);
		}
		System.out.println("End Main");
	}

}

class ChildThread extends Thread{
	public void run() {
		for(int i =0; i <= 50; i++) {
			System.out.println("ChildThread is : " + i);
		}
	}
}
