package 상속;

public class 회사 {

	public static void main(String[] args) {
		직원 m = new 직원();
		
		m.address = "울산";
		m.name = "성현";
		m.rrn = 1;
		m.slary = 2;
		System.out.println(m);
		
		매니저 m1 = new 매니저();
		m1.bonus = 100;
		m1.test();
		
		
	}

}
