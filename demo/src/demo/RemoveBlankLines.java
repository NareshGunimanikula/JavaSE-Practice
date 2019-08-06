package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class RemoveBlankLines {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Source Code: ");
		String src = s.nextLine();
		Path sr = Paths.get(src);
		BufferedReader br = Files.newBufferedReader(sr);
		
		Path trg = Paths.get("tempfile.txt");
		BufferedWriter bw = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);
		String line;
		line = br.readLine();
		while(line != null) {
			if(line.length() > 0) {
				bw.write(line + "\n");
			}
			line = br.readLine();
		}
		bw.close();
		br.close();
		Files.move(trg, sr, StandardCopyOption.REPLACE_EXISTING);
	}

}
