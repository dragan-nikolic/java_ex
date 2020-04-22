/*
File Read Example

Lnk: http://www.avajava.com/tutorials/lessons/how-do-i-read-a-string-from-a-file-line-by-line.html

*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadLineByLine {
	public static void readOldWay() {
		try {
			File file = new File("test.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readNewWay() {
		try {
			List<String> lines = Files.readAllLines(Paths.get("test.txt"));

			for(String line: lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeNewWay() {
		List<String> lines = new ArrayList<>();
		lines.add("line 1");
		lines.add("Line 2");

		try {
			Files.;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		//readOldWay();
		readNewWay();
	}
}