package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {

	public static void main(String[] args) {
		// 대문자입력받아서 소문자로 변경
		// 변수
		char big;  //char big = ' ';
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("대문자 입력하세요>");
		 big = scanner.next().charAt(0);
		 
		//처리 (1)
		// a(97) = A(65) + 32
		// big += 32;   //1) + 더하기 (ch + 32)  2)  = 대입  ch = (ch+32)
		 
		//처리 (2)
		 big = (char) (big+32);  //big(char:2byte) + 32(int:4byte)
		 
		//출력
		 System.out.println(big);
		 
		 //Q 실수에 정수대입시 실수로
		 float fl = 1 + 1.0f;
		 System.out.println(fl);
		 
	}

}
