package com.company.java002_ex;

import java.util.Scanner;

public class DatatypeEx001 {
	public static void main(String [] args) {
		//GIGO
		// 변수 - 입력 - 처리 - 출력
		//1. 변수
		int age ;
		Scanner scanner = new Scanner(System.in);  //ctrl + shift + o
		
		//2. 입력
		System.out.print("나이를 입력하세요 >");
		age = scanner.nextInt();
		
		//3. 처리 x
		
		//4. 출력
		System.out.println("내 나이는 : " + age + "입니다.");
		// System.out.printf("내 나이는 %d 입니다.", age);
		
	}
}
