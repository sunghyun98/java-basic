package a0927;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Window02 {
	private static JTextField textField;

	public static void main(String[] args) {
		//1. jframe 부품을 새로 만들어주자.
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 128));
		
		//2. 새로 만든 부품의 크기를 결정
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(127, 84, 314, 30);
		f.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(127, 152, 314, 30);
		f.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(127, 225, 314, 30);
		f.getContentPane().add(textArea_2);
		
		JLabel lblNewLabel_2 = new JLabel("주소");
		lblNewLabel_2.setFont(new Font("휴먼매직체", Font.BOLD, 28));
		lblNewLabel_2.setBounds(50, 225, 64, 30);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("전화번호");
		lblNewLabel_2_1.setFont(new Font("휴먼매직체", Font.BOLD, 28));
		lblNewLabel_2_1.setBounds(12, 145, 103, 30);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("이름");
		lblNewLabel_2_1_1.setFont(new Font("휴먼매직체", Font.BOLD, 28));
		lblNewLabel_2_1_1.setBounds(51, 84, 64, 30);
		f.getContentPane().add(lblNewLabel_2_1_1);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(286, 324, 103, 41);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("확인");
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setBounds(127, 324, 103, 41);
		f.getContentPane().add(btnNewButton_1_1);
		
		
		f.setVisible(true);
	}
}
