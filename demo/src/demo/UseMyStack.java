package demo;

public class UseMyStack {

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push("First");
		ms.push("Second");
		ms.print();
		System.out.println(ms.pop());
	}

}

 interface Stack {
	void push(String value);
	String pop();
	int length();
}

class MyStack implements Stack{

	private String a[] = new String[10];
	int top = 0;
	public void push(String value) {
		a[top] = value;
		top++;
		
	}

	public String pop() {
		top--;
		return a[top];
	}

	public int length() {
	
		return top;
	}
	
	public void print() {
		for(int i = 0; i < top; i++)
		System.out.println(a[i]);
	}
	 
}

