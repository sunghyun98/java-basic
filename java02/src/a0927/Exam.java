package a0927;

import javax.swing.JOptionPane;

public class Exam {

	public static void main(String[] args) {
		//입력
		String height = JOptionPane.showInputDialog("키입력");
		
		//처리
		double height2 = Double.parseDouble(height);
		//자바는 연산하는 데이터중 하나라도 실수이면 결과는 무조건 실수!!!
		double result = (height2 - 100) * 0.9;
		
		//출력
		JOptionPane.showMessageDialog(null, "적정뭄무게는" + result);
	}

}
