package 추상클래스인터페이스;

//클래스로 만들때 반드시 있어야하는 기능에 대한 조건을 명시
public interface MyAction {
	
	//abstract : 추상적인, 불완전하다라는 의미
	public abstract void click();//처리하는 내용x(추상메서드)
	public abstract void dbClick();//처리하는 내용x
	//public abstract: 생략가능
	//일반변수 사용 불가능, 공유할 목적으로 만든 상수만 가능
	

	

}
