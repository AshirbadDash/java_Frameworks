package com.kodnest.leet;

public class ReverseNumber {

	public void fun1(int num) {
		int rev = 0;
		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("The reverse Number is " + rev);
	}

	// using stringBuffer
	public void fun2(int num) {
		StringBuffer stringBuffer = new StringBuffer(String.valueOf(num));
		StringBuffer sb = stringBuffer.reverse();
		String s = sb.toString();
		System.out.println(s);

	}

	// USING StringBuilder
	public void fun3(int num) {

		StringBuilder st = new StringBuilder();
		st.append(num);
		StringBuilder sb = st.reverse();
		System.out.println(sb);

	}

}
