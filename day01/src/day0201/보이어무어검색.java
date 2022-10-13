package day0201;

public class 보이어무어검색 {

	public static void main(String[] args) {
		String txt = "ABABCDEFGHA";
		String pat = "ABC";
		System.out.println((int) Character.MAX_VALUE);
		int idx = bmMatch(txt, pat);
	}

	private static int bmMatch(String txt, String pat) {
		int pt; //txt커서
		int pp;	//par커서
		int txtLen = txt.length();// 11
		int patLen = pat.length();// 3
		
		int [] skip = new int[Character.MAX_VALUE + 1];
		
		return 0;
	}

}
