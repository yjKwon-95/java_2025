package com.company.java005_ex;

import java.util.Scanner;

public class RepeatEx006 {
	public static void main(String[] args) {
		// RepeatEx006 - 무한반복을 하는데 9를 입력받으면 종료
		
		//1.변수
		int num=1;
		Scanner scanner = new Scanner(System.in);
		//2.입력 3.처리 4.출력
		
		for(;;) {
			System.out.println("메뉴판입니다 9. 종료>");
			num=scanner.nextInt();
			if (num==9) {break;}
		}
	}
}
