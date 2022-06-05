package com.ezen01;

public class StringBufferEx01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		//StringBuffer의 내용을 String으로 변환한다.
		String s = sb.toString(); // String s = new String(sb);와 같음.
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
		
		String i = "abc";
		
//		i.insert(3, "a");
		
		StringBuffer in = new StringBuffer("abc");
		in.insert(2, 3);
		System.out.println(in);
		in.replace(1, 3, "ss");
		System.out.println(in);
		in.reverse();
		System.out.println(in);
	}

}

