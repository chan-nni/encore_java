/*
Map Interface
- 비선형 자료구조
- key, value 데이터를 관리
- 값을 중복허용하지만, key 중복허용하지 않는다.
- 직접파일 형식처럼 direct access 가능하여 검색에 용이하다.
- HashMap
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemoMain {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(" value 추가 >>>>> ");
		map.put("title", "불필요한 금요일");
		map.put("content", "병원에 가자");
		map.put("writer", "임섭순");
		map.put("writer", "임섭순"); // key가 중복되면 데이터는 기존 값은 사라지고 새로운 값이 들어간다.
		
		System.out.println(" 출력 >>>>>");
		System.out.println(map);
		
		System.out.println(" entrySet >>>>> Entry(key, value) ");
		for(Entry<String, String> entrySet : map.entrySet() ) {
			System.out.println(entrySet.getKey() + " , " + entrySet.getValue());
		}
		System.out.println();
		System.out.println(" keySet >>>>> ");
		for(String key : map.keySet()) {
			System.out.println(key);
			System.out.println( map.get(key));
		}
		//////////////////////////////////////////////////
		List<String> lst01 = new ArrayList<String>();
		lst01.add("A"); lst01.add("B"); lst01.add("C");
		
		List<String> lst02 = new ArrayList<String>();
		lst02.add("D"); lst02.add("E"); lst02.add("F");
		
		Map<String, List<String>> multiLst = new HashMap<String, List<String>>();
		multiLst.put("a_section", lst01);
		multiLst.put("b_section", lst02);
		//////////////
		List<String> a_section_lst = multiLst.get("b_section");
		for(String data : a_section_lst) {
			System.out.println(data);
		}
	}

}
