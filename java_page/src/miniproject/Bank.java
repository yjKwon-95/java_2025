package miniproject;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		//Q1. 메뉴판 무한반복
		//변수
		int num=0,balance=0, age =0, money=0; char id=' ',temp_id=' ', pass= ' ', temp_pass=' ', a=' ';
		Scanner scanner = new Scanner(System.in);
		
		//입력
		for(;;) {
			
			System.out.print("\n==============BANK==========\r\n"+"1.추가\n"+"2.조회\n"+"3.입금\n"+"4.출금\n"+"5.삭제\n"+"9.종료\n");
			System.out.print("해당번호 입력하세요>");
			num=scanner.nextInt();
			
			if(num==9) {System.out.println("종료기능입니다."); break;}
			switch(num) {
				case 1: System.out.println("추가기능입니다."); 
				System.out.print("ID를 입력하세요>");
				id=scanner.next().charAt(0);
				System.out.print("PASS를 입력하세요>");
				pass=scanner.next().charAt(0);
				System.out.print("BALANCE를 입력하세요>");
				balance=scanner.nextInt();
				break;
				
				case 2: System.out.println("조회기능입니다."); 
				//입력
				System.out.print("ID를 입력하세요>");
				temp_id=scanner.next().charAt(0);
				System.out.print("PASS를 입력하세요>");
				temp_pass=scanner.next().charAt(0);
				System.out.println("=======조회결과==========");
					
				//처리
				// (temp_id와 id가 같고 temp_pass와 pass가 같다면) {사용자정보출력}
				// 아니라면 {비밀번호 확인해주세요}
				if(temp_id == id && temp_pass == pass) {System.out.println("잔액=" +balance+ "나이="+age);}
				else {System.out.println("비밀번호를 확인해주세요.");}
				break;
				
				case 3: System.out.println("입금기능입니다."); 
				System.out.print("ID를 입력하세요>");
				temp_id=scanner.next().charAt(0);
				System.out.print("PASS를 입력하세요>");
				temp_pass=scanner.next().charAt(0);
				//처리
				//(temp_id와 id가 같고 temp_pass와 pass가 같다면) {==입금완료}
				// 아니라면 {다시 확인해주세요}
				if(temp_id == id && temp_pass == pass) {System.out.println("=입금완료\n" + "잔액:"+money);}
				else {System.out.println("다시 확인해주세요.");}
				break;
				
				case 4: System.out.println("출금기능입니다.");
				System.out.print("ID를 입력하세요>");
				temp_id=scanner.next().charAt(0);
				System.out.print("PASS를 입력하세요>");
				temp_pass=scanner.next().charAt(0);
				if(temp_id == id && temp_pass == pass) {System.out.println("=송금완료\n" + "잔액:"+money);}
				else {System.out.println("다시 확인해주세요.");}
				break;
				
				case 5: System.out.println("삭제기능입니다."); 
				System.out.print("ID를 입력하세요>");
				temp_id=scanner.next().charAt(0);
				System.out.print("PASS를 입력하세요>");
				temp_pass=scanner.next().charAt(0);
				if(temp_id == id && temp_pass == pass) {System.out.println("계좌를 삭제하시겠습니까?\t("+a+"/"+a+")");}
				else if(a== 'Y') {}
				else {System.out.println("다시 확인해주세요.");}
				break;
			}
			}
		//처리
		
		//출력
		
		
	}
}
