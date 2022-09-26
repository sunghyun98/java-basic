package a;

import javax.swing.JOptionPane;

public class Year {

	public static void main(String[] args) {
		//입력
		
		String age = JOptionPane.showInputDialog("나이를 입력");
		
		//처리
		//age + 1; //"100" + 1 ==> "1001"
		//숫자로 변환해주세요. ==> 어떤 부품이 숫자로 변환해주지??
		int age2 = Integer.parseInt(age);
		int age3 = age2 + 1;
		//출력
		JOptionPane.showMessageDialog(null, "내년 나이는" + age3);
		

	}

}
