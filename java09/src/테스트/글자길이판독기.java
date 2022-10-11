package 테스트;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class 글자길이판독기 {
	private static JTextField textField;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Characters:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel.setBounds(52, 38, 94, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblWords = new JLabel("Words");
		lblWords.setFont(new Font("굴림", Font.BOLD, 12));
		lblWords.setBounds(52, 98, 94, 50);
		f.getContentPane().add(lblWords);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 0));
		textField.setBounds(50, 146, 381, 241);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("click");
		btnNewButton.setBounds(55, 406, 81, 47);
		f.getContentPane().add(btnNewButton);
		
		JButton btnPadColor = new JButton("Pad Color");
		btnPadColor.setBounds(171, 406, 123, 47);
		f.getContentPane().add(btnPadColor);
		
		JButton btnTestColor = new JButton("Test Color");
		btnTestColor.setBounds(306, 406, 168, 47);
		f.getContentPane().add(btnTestColor);
		f.setVisible(true);
	}
}
