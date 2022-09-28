package a0927;

import javax.swing.JOptionPane;

public class Test02 {

	public static void main(String[] args) {
	
		
		String W = JOptionPane.showInputDialog("어제의 몸무게 : ");
		String W1 = JOptionPane.showInputDialog("오늘의 몸무게 : ");
		double doublew = Double.parseDouble(W);
		double doublew1 = Double.parseDouble(W1);
		double result = doublew - doublew1;
		
		if (result > 2) {
			System.out.println("오늘의 변화 몸무게는 : " + result+ " 성공!");
		} else {
			System.out.println("오늘의 변화 몸무게는 : " + result+ " 실패! 변화 몸무게");
			
		}
		

	}

}
