package a;

public class Data02 {

	public static void main(String[] args) {
		//정수 ==> 나이, 지갑, 금액, 우주
		byte age = 100; //127이하(1바이트)
		short wallet = 20000;//(2바이트)
		int money = 5000000;//21억(4바이트)
		long space = 1000000000L;//21억이상(8바이트)
		System.out.println("내 은행에 든 돈 : " + money + "원");
		
		//실수 ==>  몸무게, 키
		double height = 185.5; //8바이트
		float weight = 88.8f;
		System.out.println("내 키는 " + height);
		
		//문자1 ==> ''(2바이트)
		char gender = '남';
		System.out.println("내 성별은 " + gender);
		
		//특별한 부품, 기본형은 아님.
		String name = "홍길동";
		System.out.println("내 이름은  " + name);
		//논리 ==> true/false
		boolean todayFinished = false;
		
		//특별한 부품, 기본형은 아님.
		

	}

}
