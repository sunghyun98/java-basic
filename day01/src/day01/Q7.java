package day01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		//30page Q7 코드만들기
		//1~10의 합은 (1 + 10) * 5 와 같이 구할 수 있습니다. 1부터 n까지의 압을 구하는 프로그램
		
		int a;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력");
		a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			b += i; 
		}
		System.out.println("1부터 " + a + "까지의 합은 " + b );
		///////////////////////////////////////////////////////////////
		//홀수값과 짝수값이 다른 이유
		double b2 = 0;
		b2 = (1 + a) * (a / 2.0);
		System.out.println("1~" + a + "까지의 합은" + (int)b2);
	}

}
