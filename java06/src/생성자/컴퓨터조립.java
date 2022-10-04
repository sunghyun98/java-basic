package 생성자;

public class 컴퓨터조립 {
		
	public static void main(String[] args) {
		컴퓨터 c1 = new 컴퓨터(340000, "삼성", 24);
		컴퓨터 c2 = new 컴퓨터(340000, "삼성", 24);
		
		System.out.println(c1.가격 + "원 " + c1.크기 + "인치" + " " + c1.회사 );
		System.out.println(c2.가격 + "원 " + c2.크기 + "인치" + " " + c2.회사 );
		
		
	}

}
