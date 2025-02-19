package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {

	public static void main(String[] args) {
		int kor, eng, math, total, level;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 입력>");
		kor = scanner.nextInt();
		System.out.print("영어점수 입력>");
		eng = scanner.nextInt();
		System.out.print("수학점수 입력>");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		double avg = total/3.0;
		level = (int) avg/10;
		
		System.out.println("총점:"+ total);
		System.out.printf("평균:%.2f", avg);
		System.out.printf("레벨:%d \n", level); 
		System.out.println("::::::::::::::::::::::::::::::::::::"
				+ "\n::GOOD IT SCORE ::\r\n"
				+ ":::::::::::::::::::::::::::::::::::::::::::::"
				+ "\n국어\t영어\t수학\t총점\t평균\t레벨");
		System.out.println(kor + "\t" + eng +"\t" + math + "\t" +total +"\t"
		+String.format("%.2f", avg)+ "\t" + +level);
		
		System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%d", kor,eng,math,total,avg,level );
		
		
	}

}
