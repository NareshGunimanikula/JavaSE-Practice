package demo;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLDownload {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter URL : ");
		String fromurl = s.nextLine();
		System.out.println("Enter file name: ");
		String filename = s.nextLine();
		URL urlobject = new URL(fromurl);
		//String str = urlobject;
		InputStream is = urlobject.openStream();
		
		FileOutputStream fo = new FileOutputStream(filename);
		int ch = is.read();
		while(ch != -1) {
			fo.write(ch);
			ch = is.read();
		}
		fo.close();
		is.close();
	}

}
