package com.company.java005_ex;

public class ForEx004 {

	public static void main(String[] args) {
		//변수
		int cnt=0;  String result="3의 배수:";
		//입력
		//처리   Q) 1~10까지 3의 배수 갯수를 출력   

		//ver-1
		//만약 1이 3의 배수라면 갯수카운트  출력구문  3   ,6    ,9
		//만약 2이 3의 배수라면 갯수카운트
		//만약 3이 3의 배수라면 갯수카운트
		//ver-2
		//if(만약 1이 3의 배수라면)  {갯수카운트 }
		//if(만약 2이 3의 배수라면)  {갯수카운트 }
		//if(만약 3이 3의 배수라면)  {갯수카운트 }
		//ver-3
		//  if(1%3==0){ cnt++;  }
		//  if(2%3==0){ cnt++;  }
		//  if(3%3==0){ cnt++;  }
		for(int i=1; i<=10; i++) {if(i%3==0) {cnt++;}}
		//출력
		System.out.println("1~10까지 3의 배수:" +cnt);
	
	
	}

}
