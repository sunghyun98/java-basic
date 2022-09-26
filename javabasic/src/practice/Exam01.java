package practice;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {

		//입력
		String x = JOptionPane.showInputDialog("가로: ");	
		String y = JOptionPane.showInputDialog("세로: ");
		
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은  " + x1*y1);
	}

}
