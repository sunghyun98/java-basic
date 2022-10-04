package 클래스만들기;

public class Use_Phone {
	//공통적인 성질 : 사이즈,스티커
	//==> 멤버를 사용, 2개의 변수 필요
	//==> 멤버변수, 값을 넣지않고 선언만!
	//	  자동초기화시켜줌.
	int size; //0으로 자동 초기화!
	String speaker; //""으로 자동초기화
	//자동 초기화시켜주는 것 ==> 멤버변수, 배열
	//동작(기능)을 정의 : 통화하다, 사진을 찍다
	
	public void call() {
		//처리내용을 순서대로 써준다
		System.out.println("전화를 건다");
	}
	public void photo() {
		//처리내용을 순서대로 써준다..
		System.out.println("사진을 찍다");

	}
	
	
}
