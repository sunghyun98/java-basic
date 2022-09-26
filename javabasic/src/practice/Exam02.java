package practice;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {

		//입력
		String x = JOptionPane.showInputDialog("키를 입력: ");	
		
		double x1 = Double.parseDouble(x);
		
		
		//출력
		JOptionPane.showMessageDialog(null, "적정몸무게는  " + (x1 - 100)*0.9f);
	}

}
