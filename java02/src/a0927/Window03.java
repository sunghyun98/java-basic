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
import javax.swing.JScrollPane;

public class Window03 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;

	public static void main(String[] args) {
		//1. jframe 부품을 새로 만들어주자.
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 128));
		f.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setFont(new Font("한컴 말랑말랑 Bold", Font.PLAIN, 28));
		textField_1.setText("숫자1");
		textField_1.setBounds(60, 141, 87, 64);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("숫자1");
		textField_2.setFont(new Font("한컴 말랑말랑 Bold", Font.PLAIN, 28));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(60, 225, 87, 64);
		f.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.setFont(new Font("돋움", Font.PLAIN, 24));
		btnNewButton.setBounds(107, 362, 127, 64);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("더하기");
		btnNewButton_1.setFont(new Font("돋움", Font.PLAIN, 24));
		btnNewButton_1.setBounds(280, 362, 127, 64);
		f.getContentPane().add(btnNewButton_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(185, 141, 222, 74);
		f.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(185, 225, 222, 74);
		f.getContentPane().add(textField_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(126, 362, 2, 2);
		f.getContentPane().add(scrollPane);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\dbstj\\OneDrive\\바탕 화면\\wep_workspace\\01week\\day02\\img\\giphy.gif"));
		btnNewButton_2.setBounds(-43, 0, 529, 105);
		f.getContentPane().add(btnNewButton_2);
		
		//2. 새로 만든 부품의 크기를 결정
		f.setSize(500, 500);
		
		
		
		f.setVisible(true);
	}
}
