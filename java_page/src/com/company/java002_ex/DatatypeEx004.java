package com.company.java002_ex;

import java.util.Scanner;

public class DatatypeEx004 {

	public static void main(String[] args) {
		int kor,eng,math; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요 >");
		kor=scanner.nextInt();
		System.out.print("영어점수를 입력하세요 >");
		eng=scanner.nextInt();
		System.out.print("수학점수를 입력하세요 >");
		math=scanner.nextInt();
		
		int sum = kor + eng + math ;
		float ave = sum/3f;   // 정수/정수 = 정수  해결방안-> 정수/실수해야지 실수로 나옴
			
		System.out.println("총점:"+ sum);
		System.out.printf("평균:%.2f",ave);
	}

}
