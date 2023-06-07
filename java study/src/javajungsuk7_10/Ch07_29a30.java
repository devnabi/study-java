package javajungsuk7_10;

public class Ch07_29a30 {
    
    public static void main(String[] args) {
        // 7-29 ~ 7-30 여러 종류의 객체를 배열로 다루기

        // 조상타입의 배열에 자손 객체를 담을 수 있다.

        // Parent1 p1 = new Child1();
        // Parent1 p2 = new Child2();
        // Parent1 p3 = new Child3();

        // 위의 것을 배열로 더 간단하게
        // Parent1 p1[] = new Parent1[3];
        // p1[0] = new Child1();
        // p1[1] = new Child2();
        // p1[2] = new Child3();

        // 제일 간단하게 한줄로 작성
        Parent1 p1[] = {new Child1(), new Child2(), new Child3()};
        System.out.println(p1);
        

        // 참고
        System.out.println("Vector클래스(가변배열의 기능)라는 것이 있는데, object배열을 가지고 있어서 모든 종류의 객체들을 저장할 수 있다.");
        System.out.println("Vector클래스의 장점은 배열의 길이를 조절해준다. add()라는 메서드를 써서 배열에 추가만 해도 공간이 부족하면 늘려주고 많으면 줄여준다."); // 기본 배열은 한번 만들면 길이를 바꿀 수가 없다. 
    }
}

class Parent1 {

}

class Child1 extends Parent1 {}
class Child2 extends Parent1 {}
class Child3 extends Parent1 {}
