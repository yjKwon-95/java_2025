package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {

	public static void main(String[] args) {
		//변수
		int i=0; int j=0; 
		Scanner scanner=new Scanner(System.in);
		
		//입력
		System.out.print("원하는 단을 입력하세요>");
		i=scanner.nextInt();
		System.out.print("숫자를 입력하세요>");
		j=scanner.nextInt();
		
		//처리
		
		for(i=2; i<=9; i++)
		for(j=1; j<=9; j++)
		
		//출력
		/*{System.out.print(2 * 1 );}
		{System.out.print(2 * 2 );}
		{System.out.print(2 * 3 );}
		
		{System.out.print(3 * 1 );}
		{System.out.print(3 * 2 );}
		{System.out.print(3 * 3 );}
		*/
		
		{System.out.print(i +"*" +j+"="+(i*j)+"\n" );}
		

	}

}
