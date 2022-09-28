package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exam {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);
		//int target = 88;
		int count = 0; //int는 보통 0으ㅡ로 초기화 전체 횟수
		int count1 = 0; //틀린횟수
		while(true){
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count = count + 1; //count++;
			int data2 = Integer.parseInt(data);
			if (data2 == target) {
				System.out.println("정답입니다.!! 축하합니다.!!");
				System.out.println("전체 시도횟수" + count);
				System.out.println("틀린횟수" + count1);
				
				//무한루프를 반드시 끝내는 처리를 해야함.
				//break;
				System.exit(0);//정답맞추기 게임 프로그램을 종료
			}else {
				System.out.println("정답이 아닙니다.");
				count1++;
				//내가 입력한 값이 정답보다 큰지, 작은지를 알려주새요
				if(data2 > target) {
					System.out.println("너무 커요");
				}else {
					System.out.println("너무 작아요");
				}
				
			}//else
		}//while
		
		//JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요");
	}//main

}
