package 순차문;

import java.util.Scanner;

public class ConsoleExam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력 
		System.out.print("나의 이름은? ");
		String age = sc.next();
		
		System.out.print("나의 키는? ");
		double num = sc.nextDouble();
		
		System.out.print("나의 몸무게는? ");
		double num1 = sc.nextDouble();
		
		System.out.print("나는 저녁을 먹었나요? ");
		boolean de = sc.nextBoolean();
		sc.nextLine();
		System.out.print("나의 좌우명은? ");
		
		String ho = sc.nextLine();
		// 출력
		System.out.println("----------------------------------" );
		System.out.println("나의 이름은 " + age);
		System.out.println("내 내년 키는 " + (num + 10));
		System.out.println("내 내년 몸무게는 " + (num1 - 10));
		System.out.println("나는 저녁을 " + de + "했습니다.");
		System.out.println("나의 좌우명은 " + ho + "입니다.");

	}

}
