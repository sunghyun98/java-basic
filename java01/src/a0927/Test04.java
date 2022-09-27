package a0927;

import javax.swing.JOptionPane;

public class Test04 {

	public static void main(String[] args) {

		//4번문제
		int a = 66;
		int m = 77;
		int i = 88;
		int k = 99;
		
		int add = a + m + i + k;
		//정수와 정수 계산은 무조건 정수이다.
		//계산결과가 실수가나왔다하더라도 
		//실수를 잘라서 정수로 만들어버린다.!!!
		
		double av = add / 4; //82.5 ==> 82
		//82.0 <-- 82
		System.out.println(av);
		
		//둘 중 하나를 실수를 만들어라!
		//무조건 결과를 실수!!!
		double av2 = add / 4.0;
		System.out.println(av2);
		
		//다른 언어에 비해 연산자(기호)수가 작다.
		System.out.println(3 * 3);
		
		
		final double PI = 3.14;
		double r = 2.2;
		
		//p.156
		System.out.printf("%.2f", PI * r * r);
		

	}

}
