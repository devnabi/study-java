package playdatajava_10;

public class Java12{
	
    public static void main(String[] args){
    	
    	// 객체지향 프로그래밍(oop)
    	
    	// 객체의 사전적인 정의는 실제 존재하는 것을 말한다.
    	// 클래스는 텝플릿이라고 생각
    	// 객체지향 핵심특징 - 캡슐화 상속 추상화 다형성
    	// 장점 : 코드 재사용성, 모듈성, 유지보수 용이
    	// 단점 : 복잡하다.
    	
    	// 객체 생성
//    	Person newFace = new Person();
//    	
//    	// Person class의 기능을 사용
//    	newFace.name = "유성호";
//    	newFace.age = 29;
//    	
//    	Person oldFace = new Person();
//    	
//    	oldFace.name = "현수정";
//    	oldFace.age = 21;
    	
    	
    	
    	String[] names = {"유성호", "현수정"};
    	int[] ages = {29, 21};
    	// 배열로 객체생성
    	Person[] persons = new Person[2];
    	
    	for(int i = 0; i < persons.length; i++) {
    		Person person = new Person(names[i], ages[i]);
    		person.name = names[i];
    		person.age = ages[i];
    		persons[i] = person;
//    		if(i==4) {break;}
    	} // for의 끝
    	
//    	for(int i = 0; i < persons.length; i++) {
//    		System.out.println(persons[i].age + " " + persons[i].name);
//    	} // for의 끝
    	
    	
    	
    	// forEach
    	for(Person person : persons) {
    		System.out.println(person.age + " " + person.name);
    		System.out.println(person.toString());
    		System.out.println(person.getAge());
    		System.out.println(person.sound());
    	} // for의 끝
    	
    	
    	
    	Animal cat = new Animal("고양이");
    	System.out.println(cat.sound());
    	
    	
    	
    } // main의 끝
}



// 클래스 생성 : 클래스의 이름의 첫 문자를 대문자로 쓰는 것이 좋다.
class Person extends Sound { // 사람이라는 텝플릿을 만듬(설계) // 상속
	// field
	String name; // Person에게 이름이 있다.(기능)
	int age; // Person에게 나이가 있다.(기능)
	String adress;
	
	// 생성할 때 쓰인다. 생성자 cnstructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 다형성(overload) : 동일한 타입이지만 다양한 형태로 동작할 수 있는 능력을 말한다.
	public Person(int age) {
		this.age = age;
	}
	
	// 타입이 붙는 건 return할 타입을 정해준 것
	// method(기능)
	@Override // 이미 있는 것을 바꿀 때
	public String toString() {
		return "Person [name" + name + ", age=" + age + "]";
	}
	
	public int getAge(){
		return age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	public boolean equals(Person obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (age != obj.age)
			return false;
		if (name == null) {
			if (obj.name != null)
				return false;
		} else if (!name.equals(obj.name))
			return false;
		return true;
	}
	@Override
	public String sound() {
		return "안녕하세요.";
	}	
} // class의 끝



class Animal extends Sound{ // 상속
	String name;
	public Animal (String name) {
		this.name = name;
	}
	
	@Override
	public String sound() {
		return name + " " + name;
	}
} // class의 끝



// 추상화 : 받아서만 쓸 수 있다.
abstract class Sound {
    public abstract String sound();
} // class의 끝