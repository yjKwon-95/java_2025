package com.company.java002_ex;

import java.util.Scanner;

public class DatatypeEx003 {

	public static void main(String[] args) {
		//변수-입력-처리-출력
		//변수 (7자리 float / 15자리 double)
		double pi;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("파이값을 입력하세요");
		pi=scanner.nextDouble();
		
		System.out.println("파이값은" + pi +"입니다.");
		System.out.printf("파이값은%.3f입니다.", pi);

	}

}
