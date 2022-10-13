package day01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
//		// 양의정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요;
		Scanner sc = new Scanner(System.in);
//		System.out.print("양의 정수를 입력하세요 >>");
//		int a = sc.nextInt();
//		System.out.print("양의 정수를 입력하세요 >>");
//		String b = sc.next();
//		int count = 0;
//		while (a > 0) {
//			a = a / 10;
//			count++;
//		}
//		System.out.println("그 수는 " + count + "자리입니다.");
//
//		System.out.println("그 수는 " + b.length() + "자리입니다.");
//
//		boolean x = false, y = true;
//		if (x && y) {
//			System.out.println("참");
//		} else {
//			System.out.println("거짓");
//		}
//		if (!(!x || !y)) {
//			System.out.println("참");
//		} else {
//			System.out.println("거짓");
//		}

		////////////////////////////////////////////////////////////////// q11
		System.out.printf("%3s", "|");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%3d", i);
		}
		
		System.out.println();
		System.out.println("--|---------------------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%2d", i );
			System.out.printf("|");
			for(int t = 1; t < 10; t++) {
				System.out.printf("%3d", i * t );
			}
			System.out.println();
		}
		
		////////////////////////////////////////////////////////////////////2차방적식 근의 공식
		
		double a = 10.0, b = 13.0, c = 12.0;
		double x1, x2;
		
		
		x1 = -b + (Math.abs(b*b - 4*a*c)) / 2*a;
		x2 = -b - (Math.abs(b*b - 4*a*c)) / 2*a;
		
		System.out.println(x1);
		System.out.println(x2);
		
	}

}
