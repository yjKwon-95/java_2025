package com.company.java004_ex;

import java.util.Scanner;

public class IfEx003 {

	public static void main(String[] args) {
		//변수
		int num=0;
		Scanner scanner=new Scanner(System.in);
		//입력
		System.out.print("숫자를 입력하세요>");
		num=scanner.nextInt();
		//처리
		//출력
		if(num==1) {System.out.println("one");}
		else if(num==2) {System.out.println("two");}
		else if(num==3) {System.out.println("three");}
		else {System.out.println("1,2,3이 아니다.");}
	}

}
