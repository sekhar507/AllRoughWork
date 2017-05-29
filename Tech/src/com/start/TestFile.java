package com.start;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class TestFile {
	public static void main(String[] args) throws IOException {

		File file = new File("C:/test/1122.txt");

		if (file.exists()) {
			FileReader fr = new FileReader(file);
			LineNumberReader lr = new LineNumberReader(fr);
			int lines = 0;
			while (lr.readLine() != null) {
				lines++;

			}
			System.out.println(lines);
		}

	}

}
