package demo;

public class CompilationErrorQuestion {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			throwMethod();
//		}catch(IllegalAccessException e) {
//			System.out.println(e);
//		}
//	}
//
//	static void throwMethod() throws IllegalAccessException {
//		System.out.println("Inside throwMethod");
//		throw new IllegalAccessException("demo");
//	}
	public void method() {
		for(int i = 0; i< 3; i++) {
			System.out.println(i);
		}
		//System.out.println(i);
	}
}


