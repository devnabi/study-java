package javajungsuk7;

public class Ch07_7a9 {
    
    public static void main(String[] args) {
        // 7-7 ~ 7-9 오버라이딩(Overriding)

        // 오버라이딩(Overriding) : 상속받은 조상의 메서드를 자신에 맞게 변경하는 것이다.
        // 오버라이드(Override) : 덮어쓰다.

        Teemo3D teemo3d = new Teemo3D();
        System.out.println(teemo3d.Teemo2()); // 오버라이딩을 한 값이 출력된다.

        // 오버라이딩의 조건
        System.out.println("선언부가 조상 클래스의 메서드와 일치해야 한다."); // 구현부(내용)만 변경이 가능하다.(선언부 X)
        System.out.println("접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다."); // public , private, protected, default
        System.out.println("예외는 조상 클래스의 메서드보다 많이 선언할 수 없다."); // 예외는 8장에서 배운다.
    } // main의 끝
}

class Teemo { // 티모 <^오^>
    int intersection = 500; // 사거리
    String affiliation = "Bandle City"; // 소속

    String Teemo2() {
        return "티모 대위, 명을 받들겠습니다!";
    }
} // class의 끝

class Teemo3D extends Teemo {
    String Ultimate = "Poisonous Mushroom"; // 궁극기

    String Teemo2() { // 부모의 Teemo2()를 오버라이딩
        return "티모 대위, 명을 받들겠습니다! <^오^> " + Ultimate +" : 내가 바로 티모다! <^오^>";
    }
}
