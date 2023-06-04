package javajungsuk7;

public class Ch07_3a4 {
    
    public static void main(String[] args) {
        // 7-3 ~ 7-4 클래스 간의 관계, 상속과 포함

        // 포함 : 클래스의 멤버로 참조변수를 선언하는 것이다. / 상속보다는 포함을 많이 쓴다. 상속은 꼭 필요할 때만 쓴다.
        // 작은 단위의 클래스를 만들고, 그것들을 조합해서 클래스를 만든다.
        // 클래스 안에 멤버들을 여럿 쓰기 보다는 포함을 사용하여 한 클래스 안에 다른 클래스를 포함시키는 것이 깔끔하다.

        Circle c = new Circle(); // 이 객체 안에는 Point와 Circle 클래스가 들어있다.
        c.p.x = 10; // Circle안에 Point객체 안에 있는 x값은 10을 대입

        // 클래스 간의 관계 결정하기 쉬운 방법(어떤 것을 쓸지)
        System.out.println("상속관계 : ~이다.");
        System.out.println("포함관계 : ~은 ~을 가지고 있다.");

        System.out.println(c.p.x); // 10

    } // main의 끝
}

class Point {
    int x;
    int y;
} // class의 끝

class Circle { // Pount를 포함
    Point p = new Point();
    int r;

}
