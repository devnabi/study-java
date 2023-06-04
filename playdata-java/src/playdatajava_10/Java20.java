package playdatajava_10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Java20 {

	public static void main(String[] args) {
		
		Map<String, List<Person3>> map = new HashMap<>();
		
		// 서울 null -> [박씨] -> [박씨, 김씨]
		// 부산 [이씨] 
		// 대전 [도씨] 
		//제주 [류씨] 
		// 안동 []
		
		List<Person3> persons = new ArrayList<Person3>();
		persons.add(new Person3("박씨",20));
		// [박씨]
		map.put("서울", persons);
		List<Person3> persons1 = map.get("서울");
		// [박씨]
		persons1.add(new Person3("김씨",20));
		// [박씨, 김씨]
		System.out.println(map);
		
		
		List<Person3> getList = map.getOrDefault("서울", new ArrayList<Person3>());
		// {} [] [박씨]
		getList.add(new Person3("김씨",20));
		// [박씨 , 김씨]
		map.put("서울", getList);
		// {서울:[박씨], 평양 : [김]} {서울 : [박씨 , 김씨]}
		System.out.println(map);
		
	} // main의 끝

}



class Person3 {
	private String name;
	private int age;
	
	public Person3 (String name, int age) {
		this.name = name;
		this.age = age;
	}
} // class의 끝
