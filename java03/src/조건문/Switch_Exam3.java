package 조건문;

import java.util.Scanner;

public class Switch_Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("당신이 먹고 싶은 점심메뉴는>");
		String a = sc.next();
		
		if(a.equals("짜장면")){
			System.out.println("중국집으로가요.");
		}else if(a.equals("라면")){
			System.out.println("분식집으로가요.");
		}else if(a.equals("횟집")){
			System.out.println("횟집으로가요.");
		}else {
			System.out.println("그냥 안먹어요");
		}
	}

}
