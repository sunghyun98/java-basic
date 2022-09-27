package a0927;

import javax.swing.JOptionPane;

public class Test03 {

	public static void main(String[] args) {
		String exercise = JOptionPane.showInputDialog("체육: ");
		String math = JOptionPane.showInputDialog("수학 : ");
		String english = JOptionPane.showInputDialog("영어 : ");
		String korean = JOptionPane.showInputDialog("국어 : ");
		//형 변환
		int intexercise = Integer.parseInt(exercise);
		int intmath = Integer.parseInt(math);
		int intenglish = Integer.parseInt(english);
		int intkorean = Integer.parseInt(korean);
		
		int result = (intexercise + intmath + intenglish + intkorean)/4;
		
		System.out.println("평균 : " + result);
	}

}
