package com.hitv.pattern.examples.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {
	public static void main(String args[]) {
		// System.out.print(System.getProperty("user.dir"));
		int c;
		try {
			InputStream in = new LowercaseInputStream(new BufferedInputStream(
					new FileInputStream("testIO.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
