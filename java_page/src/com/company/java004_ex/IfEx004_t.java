package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004_t {

	public static void main(String[] args) {
		
		//변수
		char ch= ' ';   //char ch= '\u0000';
		String result="알파벳만 가능합니다. ";
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("문자입력하세요>");
		ch=scanner.next().charAt(0); //scanner.next() "a(0)b(1)c문자열" 
		
		//처리
		//  대문자인지,  소문자인지 판별하는 프로그램을 작성하시오.
		if( ch>='A' && ch<='Z') {result="대문자";}
		else if(ch>='a'  &&  ch<='z') {result="소문자";}
		//출력
		System.out.println(result);
	}

}
