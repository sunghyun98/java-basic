package 조건문;

public class IfElse_Test01 {

	public static void main(String[] args) {
		// 변수를 선언할 때 첫값을 넣어주어야함.(초기값)
		int jumsu = 88;

		// 변수 선언할 때, 변수가 생성;
		// 변수값을 넣지 않으면, 쓰레기값이 들어있다.
		// 연산자도 안되고, 출력도 x
		String result = ""; // 초기화
		// 변수를 선언할 때는 초기값을 넣어주세요.!!
		if (jumsu >= 90) {
			result = "A학점";
		} else if (jumsu >= 85 && jumsu < 90) {
			result = "B+학점";
		} else if (jumsu >= 80 && jumsu < 95) {
			result = "B-학점";
		} else if (jumsu >= 70) {
			result = "C학점";
		} else {
			result = "D학점";
		}
		System.out.println("당신의 학점은 " + result);
	}

}
