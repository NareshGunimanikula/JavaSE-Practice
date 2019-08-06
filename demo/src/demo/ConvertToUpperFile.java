package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ConvertToUpperFile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ener Source file: ");
		String src = s.nextLine();
		System.out.println("Ener Target file: ");
		String trg = s.nextLine();
		
		try(FileReader fr = new FileReader(src);
				FileWriter fw = new FileWriter(trg)){
			BufferedReader br = new BufferedReader(fr);
			String line;
			line = br.readLine();
			while(line != null) {
				fw.write(line.toUpperCase() + "\n");
				line = br.readLine();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
