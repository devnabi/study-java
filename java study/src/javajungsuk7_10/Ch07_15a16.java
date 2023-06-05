package javajungsuk7_10; // 패키지 선언

import static java.lang.Math.random;
// import static java.lang.Math.*;

public class Ch07_15a16 {
    
    public static void main(String[] args) {
        // 7-15 ~ 7-16 import문, static import문

        // iport : 컴파일러에게 클래스가 속한 패키지를 알려준다.
        // static import문 : static멤버를 사용할 때 클래스 이름을 생략하고 쓸 수 있다. / 코드가 길어지면 더 간단하게 쓰기 위해 만든 것이다.
        // import 패키지명.클래스명; : 더 명확하게 알 수 있는 장점이 있다 / import 패키지명.*; : 그 패키지에 속한 모든 클래스를 쓸 수 있는 장점이 있다.
        // 선언 : 패키지문과 클래스 선언의 사이에 선언을 해야한다.

        System.out.println("import 단축키 : 윈도우 기준 control + shift + o(알파벳)");
        System.out.println("java.lang 패키지(기본 패키지)의 클래스는 import를 하지 않고도 사용이 가능하다.");
        System.out.println(random()); // static import문으로 클래스 이름을 생략가능하게 하여 random()으로 사용할 수 있게 했다.
    }
}
