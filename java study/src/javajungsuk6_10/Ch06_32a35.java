package javajungsuk6_10;

public class Ch06_32a35 {
    
    public static void main(String[] args) {
        // 6-32 ~ 6-35 생성자, 기본 생성자

        // 인스턴스가 생성될 때마다 호출되는 '인스턴스(iv) 초기화 메서드'다.
        // 인스턴스 생성 시 수행할 작업(iv 초기화)에 사용
        // 이름이 클래스 이름과 같아야 한다.
        // return값이 없다.(void 안붙임) / 결과를 반환할 게 없는 것은 대입만 하면 되기때문이다.
        // 반환값이 없는 메서드는 void를 붙이지만 생성자에는 붙이지 않는 규칙이 있다. 규칙이라서 이유를 알 필요가 없다.

         // 객체 생성
        // Time t = new Time(); // 기본 생성자(매개변수가 없는 생성자) : 생성자가 하나도 없을 때에만 추가로 컴파일러가 기본 생성자를 추가해주는 것이다. / Time(){}
        // Data d = new Data(); // 기본생성자를 추가 하지 않으면 컴파일 에러 : 이름에 문제, 못 찾겠다. / 생성자가 1개 있기 때문에 우리가 추가해줘야 한다.
        
        // 초기화
        // t.hour = 12;
        // t.minute = 34;
        // t.second = 56;

        // 한줄로 초기화
        Time t = new Time(12, 34, 56); // 생성자 호출
        System.out.println(t.hour+ " " + t.minute + " " + t.second);
    } // main의 끝
}

class Time {
    int hour;
    int minute;
    int second;

    Time(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }
} // class의 끝

class Data {
    int value;

    Data(){}

    Data(int x) { // 매개변수가 있는 생성자
        value = x;
    }

}
