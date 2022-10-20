package movie;

import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JoinMember extends JFrame{

	public JoinMember() {
		JPanel p = new JPanel();
		setLocationRelativeTo(p);
		Label l1 = new Label("ID");
		Label l2 = new Label("Name");
		Label l3 = new Label("Password");
		Label l4 = new Label("PhoneNumber");
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		TextField t4 = new TextField();
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		t3.setEchoChar('*');
		
		
		JButton j1 = new JButton("저장");
		JButton j2 = new JButton("취소");
		JButton j3 = new JButton("ID중복체크");
		add(j1);
		add(j2);
		add(j3);
		
		l1.setBounds(40, 10, 40, 40);
		l2.setBounds(40, 50, 40, 40);
		l3.setBounds(40, 90, 60, 40);
		l4.setBounds(40, 130, 40, 40);
		
		
		t1.setBounds(120, 10, 200, 30);
		t2.setBounds(120, 50, 200, 30);
		t3.setBounds(120, 90, 200, 30);
		t4.setBounds(120, 130, 200, 30);
		
		j1.setBounds(125, 330, 80, 30);
		j2.setBounds(240, 330, 80, 30);
		j3.setBounds(350, 10, 100, 30);
		
		add(p);
		setSize(500,500);
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
