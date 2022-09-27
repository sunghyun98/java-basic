package a0927;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Window04 {
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(527, 611);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC7901");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(23, 34, 134, 42);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(178, 33, 255, 42);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(178, 105, 255, 42);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(23, 106, 134, 42);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\dbstj\\OneDrive\\바탕 화면\\wep_workspace\\01week\\day03\\img\\001.png"));
		lblNewLabel_2.setBounds(55, 243, 422, 321);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			//버튼을 클릭했을 때 actionPerformed()함수가 사용하도록 규칙이 설정되어있음.
			public void actionPerformed(ActionEvent e) {
				//plus버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다.
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				//1. 두수를 가지고 오세요.(String)
				String n1 = t1.getText(); //"100"
				String n2 = t2.getText(); //"200"
				
				//2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				//3. 결과출력
				JOptionPane.showMessageDialog(f, n11 + n22);
				//f.setTitle("더한결과는" + (n11 +n22));
				//result.setText("더한 결과는" + (n11 + n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.blue);
				t2.setBackground(Color.red);
			}
		});
		plus.setForeground(Color.WHITE);
		plus.setBackground(Color.GREEN);
		plus.setFont(new Font("굴림", Font.BOLD, 30));
		plus.setBounds(23, 175, 107, 56);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼 눌렀을 때 실행할 부분을 넣어줌.
				JOptionPane.showMessageDialog(minus, "마이너스 버튼을 눌렀군요");
				//1. 두수를 가지고 오세요.(String)
				String n1 = t1.getText(); //"100"
				String n2 = t2.getText(); //"200"
				
				//2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				//3. 결과출력
				JOptionPane.showMessageDialog(f, n11 - n22);
				
			}
		});
		minus.setForeground(Color.WHITE);
		minus.setBackground(Color.YELLOW);
		minus.setFont(new Font("굴림", Font.BOLD, 30));
		minus.setBounds(142, 175, 107, 56);
		f.getContentPane().add(minus);
		
		JButton mul = new JButton("*");
		mul.setForeground(Color.WHITE);
		mul.setBackground(Color.BLUE);
		mul.setFont(new Font("굴림", Font.BOLD, 30));
		mul.setBounds(266, 175, 107, 56);
		f.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.setForeground(Color.WHITE);
		div.setBackground(Color.RED);
		div.setFont(new Font("굴림", Font.BOLD, 30));
		div.setBounds(385, 175, 107, 56);
		f.getContentPane().add(div);
		f.setVisible(true);
	}
}