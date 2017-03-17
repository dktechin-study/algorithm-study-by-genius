package com.genius.codingDojang;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TabConverterSpace {

	public static void main(String[] args) throws IOException {
		String path = TabConverterSpace.class.getResource("").getPath();
		Scanner sc = new Scanner(new File(path + "TabConverterSpace.txt"));
		PrintWriter pw = new PrintWriter(new File(path + "TabConverterSpace_.txt"));
		StringBuffer sb = new StringBuffer();

		while (sc.hasNext()) {
			String a = sc.next();
			sb.append(a);
			pw.print(a);
		}
		sc.close();
		pw.close();
	}
}