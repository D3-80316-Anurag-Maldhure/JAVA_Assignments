package com.ecorp.util;

import java.util.Scanner;

public class SkipLine {
	public static void skipNextLine(Scanner sc) {
		if(sc.hasNextLine())
			sc.nextLine();
	}
}
