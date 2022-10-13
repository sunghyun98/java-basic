package day02;

public class IdTester119 {


	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a의 아이디 : " + a.getId());
		System.out.println("b의 아이디 : " + b.getId());

		System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
	}
	

}

class Id{
	private static int counter = 0;//정적(클래스) 변수
	private int id;
	
	public Id() {
		id = ++counter;
//		System.out.println("생정자 부분임");
	}
	
	public static int getCounter() {
		return counter;
	}
//	{
//		System.out.println("블록 부분임");
//	}static{
//		System.out.println("정적 블록");
//	}
	public int getId() {
		return id;
	}
}