package 프로그램;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	static int count; // int count = 0; 과 동일, 전역변수는 자동 초기화
	static final int PRICE = 5000; // 상수는 final을 붙여서 변경불가능으로 설정
	private static JTextField t1;
	
	static int 짬뽕count;
	static int 우동count;
	static int 짜장count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("짬뽕개수 : " + 짬뽕count + "우동개수 : " + 우동count + "짜장개수 : " + 짜장count);
		f.getContentPane().setBackground(new Color(128, 255, 0));

		f.setSize(800, 600);
		f.getContentPane().setLayout(null);

		JLabel t11 = new JLabel("개수");
		t11.setFont(new Font("굴림", Font.BOLD, 18));
		t11.setBounds(396, 30, 45, 52);
		f.getContentPane().add(t11);

		JLabel center = new JLabel("");
		// 라벨에 이미지를 변경하고 싶으면, 이미지부품을 만들고, 라벨에 아이콘을 셋팅
		ImageIcon img = new ImageIcon("img/짜장면.png");
		center.setIcon(img); // 주소
//		Font font = new Font("굴림", Font.BOLD, 20);
//		center.setFont(font);
		center.setFont(new Font("굴림", Font.BOLD, 20));
		center.setBounds(124, 96, 559, 368);
		f.getContentPane().add(center);

		JLabel result = new JLabel("결제금액");
		result.setFont(new Font("굴림", Font.BOLD, 22));
		result.setForeground(new Color(255, 0, 0));
		result.setBounds(137, 459, 237, 46);
		f.getContentPane().add(result);

		JButton btnNewButton = new JButton("짜장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문량을 현재 카운트에 하나 플러스
				count++;// count = count + 1, 증감연산자
				짬뽕count++;
				// t1에 현재 주문량을 변경
				t1.setText(count + "개");
				// center라벨에 있는 이미지 변경
				// 이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("img/짬뽕.png");
				center.setIcon(icon);
				// result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
				f.setTitle("짬뽕개수 : " + 짬뽕count + "우동개수 : " + 우동count + "짜장개수 : " + 짜장count);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(255, 128, 255));
		btnNewButton.setBounds(12, 20, 115, 68);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문량을 현재 카운트에 하나 플러스
				count++;// count = count + 1, 증감연산자
				우동count++;
				// t1에 현재 주문량을 변경
				t1.setText(count + "개");
				// center라벨에 있는 이미지 변경
				// 이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("img/우동.png");
				center.setIcon(icon);
				// result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
				f.setTitle("짬뽕개수 : " + 짬뽕count + "우동개수 : " + 우동count + "짜장개수 : " + 짜장count);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 64));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(142, 20, 115, 68);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문량을 현재 카운트에 하나 플러스
				count++;// count = count + 1, 증감연산자
				짜장count++;
				// t1에 현재 주문량을 변경
				t1.setText(count + "개");
				// center라벨에 있는 이미지 변경
				// 이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("img/짜장면.png");
				center.setIcon(icon);
				// result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
				f.setTitle("짬뽕개수 : " + 짬뽕count + "우동개수 : " + 우동count + "짜장개수 : " + 짜장count);
			}
		});
		btnNewButton_2.setBackground(new Color(128, 255, 255));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_2.setBounds(269, 21, 115, 68);
		f.getContentPane().add(btnNewButton_2);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBounds(453, 22, 224, 72);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		f.setVisible(true);
	}
}
