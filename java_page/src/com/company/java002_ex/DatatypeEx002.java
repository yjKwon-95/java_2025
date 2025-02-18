package com.company.java002_ex;

import java.util.Scanner;

public class DatatypeEx002 {
	public static void main(String [] args ) {
		int d;
		Scanner scanner = new Scanner(System.in);
		System.out.print("좋아하는 수(정수) 입력하세요 >");
		
		d=scanner.nextInt();
		System.out.println("좋아하는 숫자는"+ d +"입니다.");
	}
}
