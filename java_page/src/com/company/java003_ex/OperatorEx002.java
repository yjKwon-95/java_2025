package com.company.java003_ex;

import java.util.Scanner;

public class OperatorEx002 {

	public static void main(String[] args) {
		//q1-1 int형 변수 x가 3보다 크고 10보다 작을때 true인 조건식 
		int x;
		System.out.println("q1:" +( x>3 && x<10));
		
		// q1-2 char형 변수 ch가 'a' 또는 'A'일때   true인 조건식 
		char ch = ' ';   //char ch=' \u0000';
		ch = 'a';
		System.out.println("q2:"+(ch == 'a' || ch =='A'));
		
		// q1-3 char형 변수 ch가 숫자('0'~'9')일때   true인 조건식 
		
		System.out.println("q3:"+(ch >='0' && ch <='9'));
		
		// q1-4 char형 변수 ch가 영문자(대문자 또는 소문자) 일때   true인 조건식

		System.out.println("q4:"+(ch >='A' && ch <='Z' || ch >='a' && ch <='z') );
	}

}
