package javajungsuk7;

public class Ch7_1a2 {
    
    public static void main(String[] args) {
        // 7-1~ 7-2 상속

        // 기존의 클래스로 새로운 클래스를 작성하는 것이다.(코드의 재사용)
        // 두 클래스를 부모와 자식으로 관계를 맺어주는 것이다.
        // 자손의 조상의 모든 멤버를 상속받는다.(생성자, 초기화 블럭 제외)

        Child c = new Child();

        System.out.println("자손의 변경은 조상에 영향을 미치지 않는다.");
        System.out.println(c.age); // Parent의 값을 상속받았기 때문에 Child에서도 age를 쓸 수 있다.

    } // main의 끝
}

class Parent {
    int age = 5; // 멤버 1개
} // class의 끝

class Child extends Parent{
    // Parent를 부모 클래스로 지정
    // Child자신의 멤버는 0개이지만, Child에 Parent의 멤버를 상속 받았기 때문에 Parent와 같이 멤버가 1개다.
    void play() { // Child에 play()라는 멤버를 추가해도 부모 클래스에는 영향이 없다.
        System.out.println("놀자~");

    }
}
