package javajungsuk7_10;

public class Ch07_45a50 {

class InstanceInner {
    int iv = 10;
    final static int CONST = 20;
} // 내부 class의 끝

static class StaticInner {
    static int cv = 30;
} // static 내부 class의 끝

void myMethod() {
    class LocalInner {
        int lv = 40;
        final static int CONST = 40;
    } // 지역 내부 class의 끝
    int i = LocalInner.CONST;
}
    
    public static void main(String[] args) {
        // 7-45 ~ 7-50 내부 클래스의 제어자와 접근성

        // 내부 클래스 제어자는 변수에 사용가능한 제어자와 동일하다.

        System.out.println("원래 클래스에는 제어자가 public, default밖에 못오지만 내부 클래스는 다른 접근 제어자 모두 가능하다.");
        System.out.println("내부 클래스에 Static변수를 선언하고 싶다면 내부 클래스도 Static이어야만 한다. 다른 내부 클래스에서는 에러가 나는 것이 당연하다."); // 객체 생성없이 사용 가능해야하기때문이다.
        System.out.println("상수인 경우에는 인스턴스 내부 클래스, 지역 내부 클래스에서도 접근이 가능하다."); // final일 경우에 static을 많이 붙인다. 객체안에서만 쓰이는 상수가 아니라면 sataic을 붙여야 한다.
        System.out.println("포인트 1 : 외부 클래스의 Private멤버도 내부 클래스에서 접근이 가능하다.");
        System.out.println("포인트 2 : 지역 내부 클래스에서는 변수는 안되고 상수만 접근이 가능하다. / 내부 클래스의 객체가 지역변수보다 더 오래 존재할 수 있다.(메서드는 호출되면 바로 종료되기 때문에 내부 클래스에서 접근하려하면 이미 없어서 지역변수는 접근 X)");

        // 내부 클래스의 객체를 접근하고 싶다면 외부 클래스의 객체를 생성해야 한다. / 내부 클래스는 외부 클래스에서만 사용하려고 했던 것이지만 외부에서 내부 클래스의 객체가 필요할 때의 방법이다.
        Outer o = new Outer();
        Outer.Inner oi = o.new Inner();

        // 내부 클래스 출력
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        // System.out.println(LocalInner.i); 지역변수라서 에러 / 지역 내부 클래스는 메서드 내에서만 사용가능하다.
    } // main의 끝
}

class Outer {
    private int p = 100;

    class Inner {
        int p2 = p; // 외부 클래스의 private멤버도 접근이 가능하다. private은 같은 클래스에서만 접근이 가능하지만 내부 클래스는 같은 클래스기때문에 접근이 가능하다.
    } // 내부 claa의 끝

    void myMethod2() {
        int a = 300; // 지역변수 : 메서드 종료와 함께 소멸 / jdk1.8부터 바뀐 것 : final을 붙이지 않아서 변수인데도 에러가 나지 않는다.(값이 바뀌지 않으면 상수로 간주)
        final int A = 300; // 상수
        // a = 3; 값을 변경하면 상수로 간주할 수 없어서 지역 내부 클래스에서 에러가 난다.
        class LoclalInner2 {
            int lv2 = a;
            int lv3 = A;
        } // 지역 내부 클래스의 끝
    }
} // 외부 class의 끝
