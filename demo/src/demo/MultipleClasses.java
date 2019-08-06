package demo;

public class MultipleClasses {

	public static void main(String[] args) {
		MultipleClasses m = new MultipleClasses();
		m.first();
		int a = 2;
		System.out.println("Value is - " + ((a<5)?9.9:9));

	}

	public void first() {
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v,i);
		System.out.println(v.i);
	}

	public void second(Value v, int i) {
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;
		System.out.println(v.i + " " + i);
		
	}
	

}

class Value{
	public int i = 15;
}
