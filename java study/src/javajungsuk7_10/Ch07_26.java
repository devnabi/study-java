package javajungsuk7_10;

public class Ch07_26 {
    
    public static void main(String[] args) {
        // 7-26 instanceof 연산자

        // instanceof 연산자 : 참조변수의 형변환 가능여부 확인에 사용한다. 가능하면 true를 반환한다.
        // 1. 반드시 확인을 하고 2. 형변환

        // instanceof를 쓸 때, 조심해야 할 것
        System.out.println("가능여부 : 실제 객체를 가리키는 게 그것이 맞는지 확인하는 것과 같다.");
        System.out.println("포인트 : 조상들은 다 true가 나오기때문에 조심해야 한다. 어떤 객체를 가리키는지 확인해야 한다.");
        System.out.println("최고 조상인 object와 참조변수의 가능여부를 확인하려하면 true");
        System.out.println("조상과 참조변수의 가능여부를 확인하려하면 true");
        System.out.println("자기 자신끼리의 가능여부를 확인하려하면 true");

        // 형변환
        System.out.println("형변환을 하는 이유? : 참조변수를 변경함으로써 사용가능한 멤버의 개수를 조절하기 위해서 형변환을 쓴다.");
        System.out.println("형변환을 한다고 해서 가리키는 객체가 달라지지는 않는다. 타입을 바꿔서 일치시키는 것이다."); // 객체와 주소값 모두 그대로다.
    }
}
