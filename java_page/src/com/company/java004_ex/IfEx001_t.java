package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001_t {
 public static void main(String[] args) {
	 
		//변수
		int avg=0; String result="불합격";
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.print("평균을 입력하세요>");
		avg = scanner.nextInt();
		//처리
		//출력
		if(avg>=60) {result="합격";}
		System.out.println(result);
		
 }
}
