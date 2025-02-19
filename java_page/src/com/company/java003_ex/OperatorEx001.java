package com.company.java003_ex;

public class OperatorEx001 {

	public static void main(String[] args) {
		int a=3, b=10;
		System.out.println(b+=10 - a--);      // 20 - 3 =17
		//1) a--  3
		//2) 10-a  10-3=7
		//3) b+= 2  b+=7  10+=7 b=17
		//4) --  a=2
		System.out.println( a+=5);            // 2+5 = 7
		System.out.println(a>=10 || a<0 && a>3);  // false
		// ()값  비교(>,<)조건(&&)대입
		//1) a>=10        a<0     a>3
		//   7>=10        7<0     7>3
		//   false       false   true
		
	}

}
