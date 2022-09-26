package a;

import javax.swing.JOptionPane;
//부품의 위치를 알려주는 부분.
//import가 자동으로 생성되게 하려면, jop + ctrl + space
public class FirstTest {

	public static void main(String[] args) {
	
		// 자주 사용하는 것은 부품의 대문자를 그대로 쓴다.!
		//취미, 입력 이름 --> 출력
		String name = JOptionPane.showInputDialog("당신의 이름은 ");
		
		
		String age = JOptionPane.showInputDialog("당신의 나이는");
		//자주안쓰는 기능을 가진 부품은 new를 가지고 새로 만들어쓴다.
		
		System.out.println("당신의 이름은 " + age);
		JOptionPane.showInternalMessageDialog(null, "나의 이름은" + name +"\n나의 나이는 " + age);
	

	}

}
