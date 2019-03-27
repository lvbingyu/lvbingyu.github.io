package com.lby.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String args[]) {

		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";
		String pattern1 = "(.*)";
		String pattern2 = "(.*)(.*)";
		Pattern p = Pattern.compile(pattern2);
		Matcher m = p.matcher(line);

		if (m.find()) {
			for (int i = 0; i <= m.groupCount(); i++) {
				System.out.println("Found value: " + m.group(i));
			}
		} else {
			System.out.println("NO MATCH");
		}
	}
}
