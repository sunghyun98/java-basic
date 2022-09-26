package practice;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {

		// 입력
		String x = JOptionPane.showInputDialog("통신사: ");
		String tel = JOptionPane.showInputDialog("전화번호: ");
		String name = JOptionPane.showInputDialog("가입자이름 입력: ");

		// 처리
		System.out.println(name + "님은" + x + "에" + tel);

		String x1 = name + "님은" + x + "에" + tel;

		// 출력
		JOptionPane.showMessageDialog(null, "다이얼로그로" + x1 + "가입되셨습니다.");
	}

}
