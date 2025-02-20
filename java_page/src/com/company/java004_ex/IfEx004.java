package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {

	public static void main(String[] args) {
		
		//변수
		char ch= ' ';   //char ch= '\u0000';
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.print("문자입력하세요>");
		ch=scanner.next().charAt(0); //scanner.next() "a(0)b(1)c문자열" 
		//처리
		//출력
		if( ch>='A' && ch<='Z') {System.out.println("대문자");}
		else if(ch>='a'  &&  ch<='z') {System.out.println("소문자");}
	}

}
