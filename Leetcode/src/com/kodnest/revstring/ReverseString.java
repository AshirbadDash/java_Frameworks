package com.kodnest.revstring;

public class ReverseString {
	public static void main(String[] args) {
		String str = "abcd";
		String rev = "";

		int len = str.length();

		for (int i = len-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("reverse 1string is :" + rev);

	}

}
