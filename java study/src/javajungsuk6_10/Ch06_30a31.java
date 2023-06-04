package javajungsuk6_10;

public class Ch06_30a31 {
    
    public static void main(String[] args) {
        // 오버로딩(overloading)

        // 오버로딩(overloading) : 한 클래스 안에 같은 이름의 메서드를 여러 개 정의하는 것 / 과적하다.

        // 오버로딩이 성립하기 위한 조건 3가지
        System.out.println("메서드 이름이 동일해야 한다.");
        System.out.println("매개변수의 개수 or 타입이 달라야 한다."); // 매개변수는 다르지만 같은 의미의 수행을 해야한다. / 메서드 이름이 같다는 것 = 작업이 같다.
        System.out.println("반환타입은 영향없다.");

        Over over = new Over(); // 객체생성
        long result = over.add(3, 3L); // add(3, 3);으로 호출을 해버리면 어떤 메소드를 호출해야 할지 모르기 때문에 정확하게 3, 3L로 써야한다.
        System.out.println(result);

        // long result = over.add(3, 3); The method add(int, long) is ambiguous for the type Over
        // ambiguous : 모호하다. 명확하지 않다. / 에러
    } // main의 끝
}

class Over {

    // 오버로딩의 예시
    long add(int a, long b) {
        return a + b;
    }
    long add(long a, int b) {
        return a + b;
    }
}
