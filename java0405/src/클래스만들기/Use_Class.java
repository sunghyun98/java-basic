package 클래스만들기;

public class Use_Class {

	public static void main(String[] args) {
		
		Use_Phone p1 = new Use_Phone();
		System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.call();
		p1.photo();
		
		//전화기 1대 추가
		//전화기의 속성, 기능써보세요.
		Use_Phone p2 = new Use_Phone();
		System.out.println(p2);
		p2.size = 22;
		p2.speaker = "지직";
		
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		//강아지 1마리 가져다 놓으시고,
		//강아지의 속성, 동작시켜보세요.
		Use_Puppy d1 = new Use_Puppy();
		System.out.println(p1);
		d1.color = "검정";
		d1.field = "왈왈";
		
		System.out.println(d1.color);
		System.out.println(d1.field);
		d1.꼬리를흔들다();
		d1.짖다();
		
	}

}
