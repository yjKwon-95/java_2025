package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {

	public static void main(String[] args) {
		//변수
		int kor,eng,math,total=0; 
		String id= "", result="",result1="",scoreResult =""; 
		double avg=0;
		Scanner scanner = new Scanner(System.in);		
		//입력
		System.out.print("국어점수 입력하세요>");
		kor=scanner.nextInt();
		System.out.print("수학점수 입력하세요>");
		eng=scanner.nextInt();
		System.out.print("영어점수 입력하세요>");
		math=scanner.nextInt();
		System.out.print("학번 입력하세요>");
		id=scanner.next();
		
		//처리
		total=kor+eng+math; 
		avg=total/3.0;
		//(평균이 60점이상이고각과목이 40점 미만이면) 아니라면 {합격}/ 아니면 {불합격}
		if(avg>=60 && kor>=40 && eng>=40 && math>=40) {result="합격";}
		else  {result="불합격";}
		
		//(평균이 95점이상이면) {장학생}
		if(avg>=95)  {result1="장학생";}
		
		//(평균이  90점이상이면){수}, (80점이상이면) {우}, (70점이상이면) {미}, (60점이상이면) {양}, (아니라면) {가} 
		if(avg>=90) {scoreResult="수";} 
		else if(avg>=80) {scoreResult="우";} 
		else if (avg>=70) {scoreResult="미";} 
		else if(avg>=60) {scoreResult="양";} 
		else {scoreResult="가";}
	
		
		
		//출력
		System.out.println("=====================================================================\n"
		+"학번\t국어\t수학\t영어\t총점\t평균\t합격여부\t레벨\t장학생\n"
	    +"==========================================================================\n"
	    + id+ "\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+ String.format("%.2f",avg)+"\t"+result+"\t"+scoreResult+"\t"+result1);

	}

}
