package day03;

import java.util.HashMap;
import java.util.Map;

public class 헤시셋 {

   public static void main(String[] args) {
	   //map
	   Map<String, Integer> map = new HashMap<String, Integer>();
	   
	   //객체 삽입하기
	   map.put("a",100);
	   map.put("b",200);
	   map.put("c",300);
	   map.put("d",100);
	   
	   
	   //객체 검색하기
	   System.out.println(map.get("d"));
	   System.out.println(map.get("f"));
	   
   }

}