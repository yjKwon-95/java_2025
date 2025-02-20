package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {
	public static void main(String[] args) {
		//변수
		int num1,num2=0; char str=' '; String result="";
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.print("정수를 하나 입력해주세요>");
		num1=scanner.nextInt();
		
		System.out.print("정수를 하나 입력해주세요>");
		num2=scanner.nextInt();
		
		System.out.print("연산자를 입력해주세요>");
		str=scanner.next().charAt(0);
		
		//처리
		//(만약에 +면) {13} / (만약에 -면) {10}
		//int(정수:4) + char(정수:2) +int(정수:4)
		if(str=='+') {result=""+(num1+num2);}
		else if(str =='-') {result=""+(num1-num2);}
		else if(str =='*') {result=""+(num1*num2);}
		else if(str =='/') {result=String.format("%.2f",(num1/(float)num2));}
		//출력
		System.out.println(""+num1 +str+num2+"="+ result);
		
	}
}
