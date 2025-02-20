package com.company.java004_ex;

import java.util.Scanner;

public class IfEx002 {

	public static void main(String[] args) {
		//변수
		int num=0;
		Scanner sanner = new Scanner(System.in);
		//입력
		System.out.print("숫자입력하세요>");
		num=sanner.nextInt();
		//처리
		//출력
		if(num>0) {System.out.println("양수");}
		else if(num<0) {System.out.println("음수");}
		else if(num==0) {System.out.println("zero");}
		
	}

}
