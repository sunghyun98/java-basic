package day01;

import java.util.Scanner;

public class BasicEx01 {

	public static void main(String[] args) {
		
		int a, b, c;
		int max = -99999;
		int min = 999999;
		int mid;
		
		System.out.println("세 정수의 최대값을 구합니다");
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값");
		a = sc.nextInt();
		System.out.println("b의 값");
		b = sc.nextInt();
		System.out.println("c의 값");
		c = sc.nextInt();
		
		if(max < a) max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		
		if(min < a) min = a;
		if(min < b) min = b;
		if(min < c) min = c;
		
		System.out.println("최댓값은 " + max + "입니다");
		System.out.println("최솟값은 " + min + "입니다");
		
		if(a >= b)
			if(b >= c)
				mid = b;
			else if(a <= c)
				mid = a;
			else
				mid = c;
		else if(a > c)
			mid = a;
		else if(b > c)
			mid = c;
		else
			mid = c;
		System.out.println("중앙값은 " + mid + "입니다");
		
	}

}
