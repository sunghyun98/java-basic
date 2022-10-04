package 내방프로젝트;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class 파일다루기 {

	public static void main(String[] args) {
		
		try{String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		
		FileWriter file = new FileWriter(s1 + ".txt");
		file.write(s1 + "\n");
		file.write(s2 + "\n");
		file.write(s3 + "\n");
		
		//스트림이 닫힐 때 까지
		file.close();
		}catch(Exception e) {
			System.out.println("파일에 저장 중 에러 발생함.!!");
		}
	}

}
