package com.company.java005_ex;

public class ForEx005 {

	public static void main(String[] args) {
		//변수
		int cnt=0;
		
		//입력
		
		//처리
		
		//출력  Q)소문자 a~z까지 모음의 갯수를 출력하시오. 
		
		//ver-1 대상 어떠하다
		// a가 모음이라면 카운트: 갯수증가
		// b가 모음이라면 카운트: 갯수증가
		// c가 모음이라면 카운트: 갯수증가
		
		//ver-2  구조  a가 a,e,i,o,u
		//if( a가 모음이라면)  {카운트: 갯수증가}
		//if( a=='a' || a=='e' || a=='i' || a=='o' || a =='u')  {카운트: 갯수증가 cnt++}
		//if( a=='b' || b=='e' || b=='i' || b=='o' || b =='u')  {카운트: 갯수증가 cnt++ }
		//if( a=='c' || c=='e' || c=='i' || c=='o' || c =='u')  {카운트: 갯수증가 cnt++ }
		for(char ch='a'; ch<='z'; ch++)
		{if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u')  {cnt++;}}
		
		System.out.println("소문자 a~z까지 모음의 갯수>" + cnt);
	}

}
