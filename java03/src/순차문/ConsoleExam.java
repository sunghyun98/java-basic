package 순차문;

import java.util.Scanner;

public class ConsoleExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력 
		System.out.print("이름 입력>>");
		String age = sc.next();
		System.out.print("나이 입력>>");
		int year = sc.nextInt();
		System.out.print("취미 입력>>");
		String ho = sc.next();

		// 출력
		System.out.println("----------------------------------" );
		System.out.println("나의 이름은 " + age);
		System.out.println("나의 나이는 " + year);
		System.out.println("나의 취미는 " + ho);
	}

}
