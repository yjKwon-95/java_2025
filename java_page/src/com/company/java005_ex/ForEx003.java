package com.company.java005_ex;

public class ForEx003 {
	public static void main(String [] agrs) {
		//변수
		int hap=0; //hap[0]
		//입력
		//처리
		//ver-1
		//hap곳에 1누적 / "" 1 출력
		//hap곳에 2누적 / "+" 1 출력
		//hap곳에 3누적 / "+" 1 출력
		//ver-2
		// hap+=1; System.out.print("" + 1);
		// hap+=2; System.out.print("" + 2);
		// hap+=3; System.out.print("" + 3);
		//ver-3 {}  {변수} for(시작; 종료; 변화)
		
		
		
		
		
		
		hap = hap +1; //2)hap[1]  =  1) 0+1
		hap = hap +2; //2)hap[1]  =  1) 1+2
		hap = hap +3; 
		//출력
		System.out.println("1~10까지의 합:" +hap);
		
		int sum=0;
		
		for(int i=0; i<=10; i++)
			sum+=i;
		{System.out.print(sum);}
		
		/*{System.out.print(0+0);}
		/*{System.out.print(1+1);}
		/*{System.out.print(2+2);}
		/*{System.out.print(3+3);}
		

		 */
	}
}
