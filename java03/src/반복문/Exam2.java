package 반복문;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count1 = 0;
		
		while(true) {
			System.out.print("숫자입력1>>:");
			int num1 = sc.nextInt();
			System.out.print("숫자입력2>>:");
			int num2 = sc.nextInt();
			count++;
			if(num1 > num2) {
				System.out.println("앞의 숫자가 더 큽니다");
				count++;
			}else {
				System.out.println("뒤의 숫자가 더 큽니다");
				count1++;
			}
			System.out.println("종료할까요?(x) 계속할까요(0)" +count);	
			System.out.println("앞이 큰경우" +count);	
			System.out.println("뒤가 큰경우" +count1);	
			String a = sc.next();
			if(a.equals("x")) {
				System.exit(0);
			}else {
				
			}
		}

	}

}
