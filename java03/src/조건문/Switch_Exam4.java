package 조건문;

import java.util.Date;
import java.util.Scanner;

public class Switch_Exam4 {

	public static void main(String[] args) {

		Date date = new Date();
		
		int a = date.getHours();
		
		System.out.println(a);
		
		if(a <= 11) {
			System.out.println("굿모닝");
		}else if(11< a && a <= 15) {
			System.out.println("굿애프터눈");
		}else if(15 < a && a <= 19) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("잘자요");
		}
		
	}

}
