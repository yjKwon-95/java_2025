package com.company.java004_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		//변수
		int num=0;
		Scanner scanner=new Scanner(System.in);
		//입력
		System.out.print("숫자를 입력하세요>");
		num=scanner.nextInt();
		//처리//출력
		switch(num) {
		case 1:  System.out.println("1이다."); break;
		case 2:  System.out.println("2이다."); break;
		case 3:  System.out.println("3이다."); break;
		
		}
	}
}
