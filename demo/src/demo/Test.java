package demo;

//class JavaPersonClassProblem {
//	JavaPersonClassProblem(String s, int i){
//		++pid;
//		name =s;
//		age =i;
//	}
//	static int pid;
//	int age;
//	String name;
//}

public class Test {
	static int age;
	static int total = 10;
	public static void main(String[] args) {
//		JavaPersonClassProblem p1 = new JavaPersonClassProblem("John", 23);
//		Test te = new Test();
//		JavaPersonClassProblem p2 = te.change(p1);
//		System.out.println(p2.pid + " " + p2.name + " " + p2.age);
//		System.out.println(p1.pid + " " + p1.name + " " + p1.age);
//		
//		String s = "Java";
//		System.out.println(s.concat(" SE 6"));
//		//System.out.println(s.replace('S', 'B'));
//		System.out.println(s.toLowerCase());
//		System.out.println(s);
//	}
//
//	private JavaPersonClassProblem change(Object o) {
//		JavaPersonClassProblem p2 = (JavaPersonClassProblem) o;
//		p2.age = 25;
//		return p2;
//		age = age + 1;
//		System.out.println(age);
//		if("john"=="john") {
//			System.out.println("s true");
//		}
//		if("john".equals("john")) {
//			System.out.println("s equal true");
//		}
//		if("john".equals(new Button("john"))) {
//			
//		}
		String temp[] = {"",""};
		
		new Test();
	}
	public Test() {
		System.out.println("in Test");
		System.out.println(this);
		int temp = this.total;
		if(2 != 5) {
			System.out.println(temp);
		}
	}
	
}
