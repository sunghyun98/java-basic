package 반복문;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("입력(1)아이유, (2)유재석, (3)방탕>> ");
			count++;
			int x = sc.nextInt();
			if (x == 1) {
				num1++;
			} else if (x == 2) {
				num2++;
			} else if (x == 3) {
				num3++;
			} else {
				System.out.println("없는 번호입니다.");
			}

			if (count == 10) {

				System.out.println("아이유 : " + num1);
				System.out.println("유재석 : " + num2);
				System.out.println("방탄 : " + num3);
				break;

			}
		}

	}

}
