package com.company.java004_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] agrs) {
		
		//변수
		int num=0;
		Scanner scanner=new Scanner(System.in);
		//입력
		System.out.print("숫자를 한개 입력받으세요>");
		num=scanner.nextInt();
		//처리//출력
		if(num==1) {System.out.println("1이다");}
		else if(num==2) {System.out.println("2이다");}
		else if(num==3) {System.out.println("3이다");}
	}
}
