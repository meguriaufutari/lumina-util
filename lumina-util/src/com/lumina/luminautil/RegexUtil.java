package com.lumina.luminautil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Xemjas
 *
 */
public class RegexUtil {
	public static boolean checkNumberOnly(String text) {
		Pattern pattern = Pattern.compile("[0-9]{1,}");

		Matcher matcher = pattern.matcher(text);

		return matcher.matches();
	}
	
}
