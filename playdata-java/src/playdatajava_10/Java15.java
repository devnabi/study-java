package playdatajava_10;

public class Java15 {

	public static void main(String[] args) {
		
		// static : 정적
		
		Test test = new Test();
		test.a = 1; // test 라는 설계도 안에 a라는 기능에 1을 넣어준다.
		System.out.println(test.b + " " + test.a); // b는 0이 담겨있기때문에 출력은 0 1
		System.out.println(Test.class + " " + Test.b);
		
		for(int i = 0; i < 3; i++) {
			Test test1 = new Test();
			test1.plus(i);
		} // for의 끝
		System.out.println(test.b + " " + Test.b); // 만들 때마다 1을 증가시키기 때문에 4 4가 출력된다.
	}

}

class Test {
	int a;
	static int b = 0;
	
	// 생성자
	public Test() {
		b++; // 0이였던 b를 1로 변경
	}
	
	// static은 new로 생성을 하지않고도 매서드를 부를 수 있다. 메모리를 좀 더 효율적으로 사용하게 해준다. (메모리를 아끼는 것)
	// 사용에 따라 동시성 처리 때문에 안될 수도 있다. 각자 가져야 될 값이 있는데 한 번에 처리하려고 하면 문제가 생길 수 있다.
	public static void plus(int i) {
		b += i;
	}
	
} // class의 끝
