package 상속;

public class 원더우먼 extends 우먼{
	//멤버변수 2개,멤버메서드 12개
	public void 싸우다() {
		System.out.println("악당과 싸우다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [gender=" + gender + ", name=" + name + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() +  "]";
	}

}
