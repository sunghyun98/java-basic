package 순차문;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.crypto.Data;

public class ConsoleTest02 {

	public static void main(String[] args) {
//		JButton b1 = new JButton();
//		JButton b2 = new JButton();
//		JFrame	f = new JFrame();
//		JTextField t1 = new JTextField();
//		JTextField t2 = new JTextField();
//		JTextArea ja = new JTextArea();
//		Random r = new Random();
//		Data date = new Date();

		Scanner sc = new Scanner(System.in);
		//입력 : 나이
		System.out.println("나이름 입력>>");
		int age = sc.nextInt();
		
		//처리
		int age2 = age + 1;
		
		//출력
		System.out.println("내년 나이는" + age2);
		
	}

}
