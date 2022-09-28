package 순차문;

import java.util.Scanner;

public class ConsoleTest {

	public static void main(String[] args) {
		//Scanner를 새롭게 만들어서
		//이클립스의 콘솔뷰에서 입력을 받아보자.!!
		Scanner sc = new Scanner(System.in);

		System.out.print("이름은 : ");
		String name = sc.next();//입력을 받음. String!!
		System.out.println("입력받은 이름은 " + name + " 입니다.");
		
		System.out.print("소속을 입력 : ");
		String com = sc.next();//입력을 받음. String!!
		System.out.println("입력받은 소속은 " + com + " 입니다.");
}

}
