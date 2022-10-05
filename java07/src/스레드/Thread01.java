package 스레드;

public class Thread01 extends Thread {
	@Override
	public void run() {
		// 동시에 처리되게 하고 싶은 내용을 적는다.
		for (int i = 0; i < 1000; i++) {
			System.out.println("$");
		}

	}
}
