package com.company.java005_ex;

import java.util.Scanner;

public class Repeat001_For2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//무한반복
		for(;;) { //조건이 없으면 무한반복
			System.out.println("숫자1를 입력하세요>");
			int a= scanner.nextInt();
			if (a==1) {break;}
			//a가 1이라면 나가기  #2. 나갈조건
		}
		
		// for - break
		// 1 2 3 뒤로 없어짐! 
		for(int i=1; i<=10; i++) {
			if(i==3) {break;}
			System.out.print(i+"\t");
		}
		// for - continue -skip
		// 1 2 (3) 4 5 6 7 8 8 9 10
		for(int i=1; i<=10; i++) {
			if(i==3) {continue;}
			System.out.print(i+"\t");
	}
		
		/// 메뉴판만들기
		// RepeatEx006 - 무한반복을 하는데 9를 입력받으면 종료

}
}
