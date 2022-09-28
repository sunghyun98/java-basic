package a0927;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// 자바는 기본적으로 문법이 많은 편! (20가지)
		// cpu가 처리하기 위한 데이터는 ram에 넣어두고 가져다가 처리!!
		// 자바는 부품조립식언어(객체지향형 언어)
		// 어떤 부품으로 입력을 받을까???
		// 대문자로 바로 부품을 쓸 수 있음.
		// new키워드를 통해서 부품을 만들어 쓸 수 있음
		//입력
		String w = JOptionPane.showInputDialog("가로크기"); //"100"
		String h = JOptionPane.showInputDialog("세로크기"); //"200"
		// 모든 외부입력은 String(문자열)
		// 처리
		// 면적 total = 가로 * 세로
		// 정수로 바꾸어야겠다. ==> 해당 부품을 찾아라.!
		// Integer, Double
		
		int width = Integer.parseInt(w);
		int height = Integer.parseInt(h);
		int total = width * height;
		
		// 출력
		// 어떤 부품을 쓸가요? ==>System.out, JOptionPane
		// +연산자(결합, 산술)
		// 산술: 숫자여야 함
		// 결함: 더해지는 값들 중 하나라도 String이면 결합!! 결과도 무조건 String!!
		JOptionPane.showMessageDialog(null, "사각형의 면적은" + total);
	}

}
