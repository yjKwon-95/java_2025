package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {

	public static void main(String[] args) {
		int in1, in2; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자입력1>");
		in1 = scanner.nextInt();
		System.out.print("숫자입력2>");
		in2 = scanner.nextInt();
		
		double d = in1/ (double) in2; // 정수/실수
		
		System.out.printf("%d / %d = %.2f", in1, in2, d);
		
		
	}

}
