package 클래스만들기;

import java.util.Scanner;

public class 계좌정보프린트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		계좌 계좌1 = new 계좌();
		계좌 계좌2 = new 계좌();
		계좌 계좌3 = new 계좌();
		
		System.out.print("이름 = ");
		계좌1.이름 = sc.next();
		System.out.print("계좌이름 = ");
		계좌1.계좌이름 = sc.next();
		System.out.print("금액 = ");
		계좌1.금액 = sc.nextInt();
		
		
		System.out.print("이름 = ");
		계좌2.이름 = sc.next();
		System.out.print("계좌이름 = ");
		계좌2.계좌이름 = sc.next();
		System.out.print("금액 = ");
		계좌3.금액 = sc.nextInt();
		
		
		
		System.out.print("이름 = ");
		계좌3.이름 = sc.next();
		System.out.print("계좌이름 = ");
		계좌3.계좌이름 = sc.next();
		System.out.print("금액 = ");
		계좌3.금액 = sc.nextInt();
		
		
		계좌1.계좌만들기();
		계좌2.계좌만들기();
		계좌3.계좌만들기();
		}
		
		
	}


