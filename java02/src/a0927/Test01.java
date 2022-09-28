package a0927;

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) {
		String pw = "p";
		
		String pw1 = JOptionPane.showInputDialog("암호 입력");
		
		if (pw.equals(pw1)) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");
			
		}
		

	}

}
