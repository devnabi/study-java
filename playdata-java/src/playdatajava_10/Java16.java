package playdatajava_10;

import java.util.ArrayList;
import java.util.List;

public class Java16 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		List<Integer> list = new ArrayList<>(); // List는 길이가 무한
		
		// 배열에 넣어주기
		list.add(1);
		list.add(2);
		list.add(1);
		
		// Integer[] tmp = (Integer[]) list.toArray(); 은 실행하면 에러가 나서 고쳤다.
		Integer[] tmp = list.toArray(new Integer[0]); // 제네릭 배열?
		
		// 주소값 출력
		System.out.println(arr);
		
		// 배열 출력 / 내부에 toString()이 있는 것 / 둘 다 같다.
		System.out.println(list);
		
		
		// remove() : 지정한 요소를 제거하는 기능을 가진 매소드 / 제거를 성공하면 true를 반환, 찾는 요소가 없어서 실패하면 false를 반환
		// System.out.println(list.remove("st")); // "st"라는 문자열이 배열에 담겨있지 않기 때문에 false가 출력된다.
		System.out.println(list.get(1)); // 인덱스 1을 가져오기
		System.out.println(list.set(0, 3)); // 0을 3으로 변경하고 이전 값인 1을 반환한다.
		System.out.println(list); // set()으로 변경한 것을 확인	
		
		
		
//		123456789 넣고 짝수의 합을 구하자 20
		List<Integer> list2 = new ArrayList<>();
	    int sum = 0;
	    for (int i=1; i<10; i++) {
	        list2.add(i);
	    }
	    for (int i=0; i<list2.size(); i++) {
	    	if (list2.get(i) % 2 == 0) {
	            sum += list2.get(i);
	        }
	    }
	    for(Integer i:list2) if(i %2 ==0) sum += i;
	    System.out.println("짝수의 합:" + " " + sum);
// 	name 과 age 를 가지고 있는 person을 만들고
// 	input 데이터 :
//	    {name : park, age: 20}, {name:kim, age: 14},{name:lee, age: 24},
//	    한 해가 지나서 한살 먹어야함 한살 씩 먹이고 출력하라
//	   output :
//	    [{name : park, age: 21}, {name:kim, age: 15},{name:lee, age: 25},]
		Person2 person1 = new Person2("park", 20);
		Person2 person2 = new Person2("kim", 14);
		Person2 person3 = new Person2("lee", 24);
		List<Person2> persons = new ArrayList<Person2>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
//		for(int i =0; i< persons.size(); i++) {
//			Person tmp1 = persons.get(i);
//			Person p = new Person(tmp1.getName(), tmp1.getAge()+1);
//			persons.set(i, p);
//		}
//		for(Person person: persons) {
//			person.setAge(person.getAge()+1);
//		}
		for(Person2 person: persons) {
			person.grow();
		}
		String answer = "[";
		for(Person2 temp2: persons)
        {
            answer += "{name:"+temp2.getName()+","+"age:"+temp2.getAge()+"},";
        }
		System.out.println(answer+"]");	
		System.out.println(persons);
		
	} // main의 끝

}



//class ArrayList extends List
class Person2 {
	private String name;
	private int age;
	public Person2(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void grow() {
		age++;
	}
	@Override
	public String toString() {
		return "{name=" + name + ", age=" + age + "}";
	}
	
}