package day02;

import java.util.Scanner;

public class 보초예제2 {
	public static int seqSearch(int[] a, int n, int key) {
		 for (int i = 0; i < n; i++)
	            if (a[i] == key)
	                return i;               
	        return -1;                   
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);//자동 import 단축키 ctrl + shift + o
		System.out.println("요솟수");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]");
			x[i] = stdIn.nextInt();
		}
		System.out.println("검색할 값 : ");
		int ky = stdIn.nextInt();
	
		int idx = seqSearch(x, num, ky);
		if(idx == -1) {
			System.out.println("그값의 요소가 없습니다.");
		}
		else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}

}
