package com.softserve.edu;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppReg {
	public static void main(String[] args) {
		//String pattern = "Now is the time";
		// String pattern = "[ Na-z]+";
		//String pattern = "[a-z]+";
		//
		//String text = "Now is the time";
		//
		//String pattern = "<.+>";
		//String pattern = "<[^>]+>"; // All tags
		//String pattern = ">[^><]+<"; // All text
		//String pattern = "<([^>]+)>[^><]+</\\1>"; // \1 == group(1)
		//String text = "<p><b>Beginning with bold text</b> next, <span>text</span> body,<i>italic text</i> end of text.</p>";
		//
		//String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w{2,}";
		//String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+com";
		// System.out.println("Pattern = " + pattern);
		//String text = "a.bd.c@gmail.com";
		//String text = "a.b.c@gmail.com a@i.ua a.@gmail.com a@gmail.a _@ukr.net";
		//
		//String pattern = "\\b(\\d{1,3}[,'])*\\d{1,3}\\.\\d{2}\\b";
		//String pattern = "\\b\\d{1,3}([,']\\d{3})*\\.\\d{2}\\b";
		//String text = "4 item(s) - $1'111,450.40 text";
		//
		//String pattern ="([\\w])\\1";
		//String pattern = "\\b\\w*([\\w])\\1\\w*\\b";
		//String text = "letter abba work";
	    //
	    //String pattern ="https?://(\\w+\\.)+\\w{2,}(:\\d{1,5})?(/\\w+)*/?(\\?\\w+=\\w+(&\\w+=\\w+)*)?";
	    //String text = "https://www.google.com:8080/api/users/1?key1=val1&k2=v2";
	    //String text = "http://www.google.com";
		//
	    String pattern = "(\\d+\\.)+\\d+";
	    String text = "first 192.168.103.141, second 192.168.103.142, 192.168.103.143";
	    //
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//
		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		//
		// 2. Get all parts
		m.reset();
		//List<String> list = new ArrayList<>();
		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + "*");
			//System.out.print(text.substring(m.start() + 1, m.end() - 1).trim() + "*");
			//list.add(text.substring(m.start(), m.end()));
		}
		/*-
		for (String current : list) {
			System.out.println(current);
			//double price = Double.valueOf(current.replaceAll("'|,", ""));
			//System.out.printf("(price+1) = %.2f",(price + 1));
		}
		*/
	}
}
