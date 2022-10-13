package day01;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		String[][] s = new String[10][2];
		s[0][0] = "0397134";
		s[0][1] = "김효진";
		s[1][0] = "0465345";
		s[1][1] = "이종협";
		s[2][0] = "0427214";
		s[2][1] = "서상춘";
		s[3][0] = "0487342";
		s[3][1] = "배영미";
		s[4][0] = "0512478";
		s[4][1] = "김예진";
		
		//키보드로 입력 받아서 넣기 
		// 비어있는 인덱스 5를 구해서 여기에 넣기 
		int i=0, j=0;
		for( ; i< s.length; i++) {
			if( s[i][0] == null ) break;
     	}
		System.out.println(i + " ");
		Scanner sc = new Scanner(System.in);
	    System.out.print("학번은 ");
		s[i][0] = sc.next();
		System.out.print("이름은 ");
		s[i][1] = sc.next();

		for(String[] ss : s ) {
			for(String sss : ss) {
				System.out.print( sss + "\t");
			}
			System.out.println();
		}
		
		//배영미를 삭제해 보세요
		//1단계 배영미를 찾아라 2단계 배영미 들어 있는 배열에 값을 null로 바꾸어 주기

	}

}
