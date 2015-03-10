package ts;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
//		Object[] o = new Object[2147483647];
//
//		System.out.println(o);
		// test map
		System.out.println("-------------------------------");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 12345);
		map.put("name", "zhangsan");
		
		for(String s : map.keySet()) {
			System.out.println("key:" + s + " value:" + map.get(s));
		}
		
		for(Map.Entry<String, Object> m : map.entrySet()) {
			System.out.println(m.getKey() + "\t" + m.getValue());
		}
		
	}

}
