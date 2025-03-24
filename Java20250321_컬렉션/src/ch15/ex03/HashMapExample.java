package ch15.ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 entry 수 : " + map.size());
		System.out.println();
		
		String Key = "홍길동";
		int value = map.get(Key);
		System.out.println(Key + " : " + value);
		System.out.println();
		
		Set<String> KeySet = map.keySet();
		Iterator<String> keyIterator = KeySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k+ " : " + v);
		} System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
	}

}
