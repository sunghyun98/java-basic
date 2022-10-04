package 내방프로젝트;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(128, 255, 0));
		f.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 128));
		t1.setColumns(10);
		t1.setBounds(262, 329, 138, 43);
		f.getContentPane().add(t1);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 255, 128));
		t2.setColumns(10);
		t2.setBounds(262, 396, 138, 43);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();//id
				String s2 = t2.getText();//pw
				
				if(s1.equals("root") && s2.equals("1234")) {
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
				//
				
//				일기쓰기화면 diary = new 일기쓰기화면();
//				diary.open();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\dbstj\\eclipse-workspace\\java02\\img\\009.png"));
		btnNewButton.setBounds(37, 460, 194, 193);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1, t2의 글자를 지워지는 것처럼 공백을 집어넣어라
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\dbstj\\eclipse-workspace\\java04\\img\\cat.png"));
		btnNewButton_1.setBounds(262, 460, 210, 193);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setBounds(107, 328, 124, 44);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(107, 396, 124, 44);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\dbstj\\eclipse-workspace\\java04\\img\\book.png"));
		lblNewLabel_2.setBounds(111, 10, 274, 267);
		f.getContentPane().add(lblNewLabel_2);

		f.setSize(500, 700);

		f.setVisible(true);
	}
}
