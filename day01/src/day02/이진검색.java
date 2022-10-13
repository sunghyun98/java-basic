package day02;

public class 이진검색 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int key = 3;
		
		int idx = 이진검색메소드(a, a.length, key);
		if(idx == -1) {
			System.out.println("그값의 요소가 없습니다.");
		}
		else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}

	private static int 이진검색메소드(int[] a, int length, int key) {
		//변수선언
		int pl = 0; //0
		int pr = length - 1;//9 a[0]....a[9]
		
		
		do {
			int pm = (pl + pr) / 2;
			if(a[pm] == key) {
				return pm;
			}else if(a[pm] > key){
				pr = pm - 1;
			}else if(a[pm] > key){
				pl = pm + 1;
			}
		}while(pl <= pr);
		return -1;
	}
}
