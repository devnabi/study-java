package javajungsuk7_10;

public class Ch07_22 {
    
    public static void main(String[] args) {
        // 7-22 캡슐화

        // 캡슐화와 접근제어자 
        // 접근제어자를 사용하는 이유
        System.out.println("접근 제어자로 직접 접근을 막고 메서드를 통한 간접접근을 허용하는 것이 캡슐화다.");
        System.out.println("1. 데이터를 보호하기 위해서 / 2. 외부에는 불필요한, 내부적으로 사용되는 부분을 감추기 위해서 접근제어자를 쓴다.");

        Time t = new Time();
        // t.hour = 100; 접근 제어자 private을 사용하지 않으면 0~23사이의 값이 아니더라도 값을 가질 수 있지만 이것은 원하는 것이 아니다.
        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(100); // 100은 유효한 값이 아니기때문에 21만 출력이 된다.
        System.out.println(t.getHour());
    }
}

class Time {
    private int hour; // 0~23사이의 값을 가져야 하기때문에 private을 붙인다.
    // private int minute; // 0~59
    // private int second; // 0~59

    // 메서드를 통해서 iv로 접근하게 한다.
    public void setHour(int hour) {
        if(0 > hour || hour > 23) {
            return;
        } // if문으로 값을 보호
        else {
            this.hour = hour;
        }
    }

    public int getHour() {
        return hour;
    }
}
