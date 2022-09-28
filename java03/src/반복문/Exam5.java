package 반복문;

public class Exam5 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			// 1부터 1씩 증가하면서 10까지 처리!!
			sum = sum + 1;
		}
		System.out.println(sum);
		///////////////////////////////////////////////////////
		System.out.println("-------");

		int sum2 = 0;
		for (int i = 3; i <= 11; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		/////////////////// 문제1/////////////////////////////////
		System.out.println("-------");
		int sum3 = 0;
		for (int i = 33; i <= 222; i++) {
			sum3 = sum3 + i;

		}
		System.out.println(sum3);
		//////////////////////////////////////////////////
		System.out.println("-------");
		int sum4 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum4 = sum4 + i;

		}
		System.out.println(sum4);
		///////////////////////////////////////////////////
		System.out.println("-------");
		int sum5 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum5 = sum5 + i;

		}
		System.out.println(sum5);
		/////////////////////// 문제2/////////////////////////////
		System.out.println("-------");
		int sum6 = 0;
		for (int i = 1; i <= 1000; i = i + 3) {
			if (sum6 >= 100) {
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			sum6 = sum6 + i;
		}
		System.out.println(sum6);
	}

}