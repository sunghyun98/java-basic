package 클래스만들기;

public class 집을지어보자 {

	public static void main(String[] args) {
		// 모든 부품은 ram에 준비/저장되어 있어야 함.
		벽돌들 벽돌1 = new 벽돌들();
					//벽돌틀을 이용해서 벽돌을 하나 만들어라
		
		벽돌1.x = 50;
		벽돌1.y = 50;
		
		벽돌1.쌓다();
		
		//"주소"만 있으면 변수, 메서드에도 접근 가능
		//현재는 벽돌1는 주소가 들어있음
		
		벽돌들 벽돌2 = new 벽돌들();
		
		벽돌2.x = 150;
		벽돌2.y = 150;
		
		벽돌2.쌓다();
		
		System.out.println(벽돌1);
		System.out.println(벽돌2);
		System.out.println(벽돌1.x);
		System.out.println(벽돌2.y);
		
	}

}
