package 내방프로젝트;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰기화면 {
	//멤버변수
	private static JTextField t1;
	private static JTextField t2;
	private static JTextArea t3;
	
	//멤버메서드
	/**
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 128));
		f.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setBackground(new Color(128, 255, 128));
		t1.setColumns(10);
		t1.setBounds(205, 36, 229, 43);
		f.getContentPane().add(t1);
		
		t2 = new JTextField();
		t2.setBackground(new Color(128, 255, 128));
		t2.setColumns(10);
		t2.setBounds(205, 103, 229, 43);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setBackground(new Color(128, 255, 128));
		t3.setBounds(205, 169, 229, 160);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel = new JLabel("오늘날짜");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setBounds(50, 35, 124, 44);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘제목");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(50, 103, 124, 44);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘내용");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(50, 172, 124, 44);
		f.getContentPane().add(lblNewLabel_1_1);
		
		
		t3.setBackground(new Color(128, 255, 128));
		t3.setBounds(205, 169, 229, 160);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				try{			
				FileWriter file = new FileWriter(s1 + ".txt");
				file.write(s1 + "\n");
				file.write(s2 + "\n");
				file.write(s3 + "\n");
				
				//스트림이 닫힐 때 까지
				file.close();
				}catch(Exception e1) {
					System.out.println("파일에 저장 중 에러 발생함.!!");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(50, 385, 400, 102);
		f.getContentPane().add(btnNewButton);

		f.setSize(500, 600);

		f.setVisible(true);
	}
}
