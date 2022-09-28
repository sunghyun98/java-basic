package 조건문;

public class IfElse_Test {

	public static void main(String[] args) {
		//기본형 비교 vs 다른형 비교
		String data = "ok";
		
		if(data.equals("ok") ) {
			System.out.println("긍정");
		}else if(data.equals("no")){
			System.out.println("부정");
		}else {
			System.out.println("잘모르겠음.");
		}
	}

}
