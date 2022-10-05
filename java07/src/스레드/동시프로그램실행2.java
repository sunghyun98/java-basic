package 스레드;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		Thread03 t3 = new Thread03();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
