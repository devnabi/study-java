package javajungsuk7;

public class Ch07_5a6 {
    
    public static void main(String[] args) {
        // 7-5 ~ 7-6 단일상속, Object클래스

        // Java는 단일상속만 허용한다.
        // 부모가 없는 클래스는 자동적으로 extends object클래스를 상속받게 된다. / 컴파일러가 자동추가
        // 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다. / toString(), equals(Object obj), hashCode()...

        Extends2 e2 = new Extends2();
        System.out.println("비중이 높은 클래스 하나를 상속관계로, 나머지는 포함관계로 한다.");
        System.out.println(e2); // 클래스 이름@객체주소값 / e2.toString()과 같은 것이다.
        System.out.println(e2.toString()); // Object클래스에 정의된 메서드이기 때문에 toString()을 호출할 수 있다.
        System.out.println(e2.e.a); // 3
        System.out.println(e2.b); // 5

    }
}

class Extends { // extends Object가 생략된 것이다.
    int a = 3;
}

class Extends2 { // 포함
    Extends e = new Extends();
    int b = 5;
}
