package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005_t {

	public static void main(String[] args) {
		//변수
		char a= ' ';
		Scanner scanner=new Scanner(System.in);
		String result="알파벳을입력하세요";
		//입력
		System.out.print("문자를 입력하세요>");
		a=scanner.next().charAt(0);
		//처리
		if(a >= 'A' && a <='Z' )      { result =""+(a+=32);}
		else if(a >= 'a' && a <='z' ) { result =""+(a-=32);}
		
		//출력   if( 대문자 이면) { 소문자}로, else if(소문자이면) {대문자}로 변경
		 {System.out.println(result);}
	}

	}
