package demo;

public class ClassesDemo {
	public int a = 1;
	private int b = 2;
	public void method(final int c) {
		int d = 3;
		class inner{
			private void iMethod(int e) {
				a = 10;
			}
		}
	}
}
