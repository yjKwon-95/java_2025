package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {

	public static void main(String[] args) {
		//변수
		char a= ' ';
		Scanner scanner=new Scanner(System.in);
		//입력
		System.out.print("문자를 입력하세요>");
		a=scanner.next().charAt(0);
		//처리
		//출력   if( 대문자 이면) { 소문자}로, else if(소문자이면) {대문자}로 변경
		if(a >= 'A' && a <='Z' )      {System.out.println((char)(a + 32));}
		else if(a >= 'a' && a <='z' ) {System.out.println((char)(a - 32));}
		else                          {System.out.println("알파벳을 입력하세요.");}
	}

	}
