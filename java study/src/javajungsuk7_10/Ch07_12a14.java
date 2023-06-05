package javajungsuk7_10;

public class Ch07_12a14 {
    
    public static void main(String[] args) {
        // 7-12 ~ 7-14 패키지, 클래스 패스

        // 패키지(폴더) : 서로 관련된 클래스의 묶음 / Java8 기준으로 약 4천개의 클래스가 있는데 그것을 관리하기 쉽게 만든 것이 패키지다.
        // 클래스(파일)
        // 클래스 패스(class path) : 클래스 파일의 위치를 알려주는 경로

        System.out.println("클래스의 실제 이름(full name)은 패키지를 포함한 것이다.");
        System.out.println("패키지는 소스파일의 첫 번째 문장으로 단 한번 선언한다.");
        System.out.println("같은 소스파일의 클래스들은 모두 같은 패키지에 속하게 되고, 패키지 선언이 없으면 이름없는 default 패키지에 속하게 된다.");
        System.out.println("환경변수(class path)로 관리하며 경로간의 구분자는 (세미콜론);을 사용한다."); // 환경변수에 (패키지 루트)경로를 등록하여 사용
    }
}
