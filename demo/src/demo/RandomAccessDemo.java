package demo;

import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) throws Exception {
		int phonenumber[] = {1111111,2222222,3333333,4444444};
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Naresh Gunimanikula\\Desktop\\number.dat", "rw");
		for(int n :  phonenumber) {
			raf.writeInt(n);
		}
		raf.seek(0);
		int count  = (int) raf.length() / 4;
	
		for(int i =0; i< count; i++) {
			System.out.println(raf.readInt());
		}
		
		raf.seek(2 * 4);
		raf.writeInt(9999999);
		
		raf.seek(0);
		for(int i =0; i< count; i++) {
			System.out.println(raf.readInt());
		}

	}

}
