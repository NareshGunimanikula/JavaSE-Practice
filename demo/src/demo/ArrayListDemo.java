package demo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Naresh");
		al.add("Priya");
		al.add("Honey");
		al.add(1,"Loves");
		
		for(Object obj : al) {
			System.out.println(obj);
		}
		al.remove("Honey");
		
		for(Object ob : al) {
			System.out.println(ob);
		}
		
		System.out.println(al.indexOf("Priya"));
	}

}
