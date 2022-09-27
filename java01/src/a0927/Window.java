package a0927;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		
		f.setSize(400, 400);
		f.setVisible(true);
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.setFont(new Font("돋움", Font.PLAIN, 23));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		btnNewButton_1.setBackground(new Color(255, 128, 128));
		btnNewButton_1.setFont(new Font("HY엽서L", Font.PLAIN, 26));
		btnNewButton_1.setForeground(new Color(0, 255, 64));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("중앙");
		btnNewButton_2.setFont(new Font("휴먼매직체", Font.BOLD | Font.ITALIC, 23));
		btnNewButton_2.setBackground(new Color(0, 255, 255));
		btnNewButton_2.setForeground(new Color(0, 128, 64));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("남쪽");
		btnNewButton_3.setFont(new Font("함초롬바탕", Font.PLAIN, 33));
		btnNewButton_3.setBackground(new Color(255, 0, 128));
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("동쪽");
		btnNewButton_4.setFont(new Font("휴먼매직체", Font.PLAIN, 33));
		btnNewButton_4.setBackground(new Color(255, 128, 128));
		f.getContentPane().add(btnNewButton_4, BorderLayout.EAST);
	}

}
