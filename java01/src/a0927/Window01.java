package a0927;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Window01 {
	private static JTextField textField;

	public static void main(String[] args) {
		//1. jframe 부품을 새로 만들어주자.
		JFrame f = new JFrame();
		
		//2. 새로 만든 부품의 크기를 결정
		f.setSize(500,500);
		
		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\dbstj\\eclipse-workspace\\java01\\img\\001.png"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("돌아간다");
		f.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		f.setVisible(true);
	}

}
