package playdatapack.main;

import playdatapack.main.data.Unit;
import playdatapack.main.unit.Marine;
import playdatapack.main.unit.Zealout;

public class Main {

	public static void main(String[] args) {
		// 접근 제어자
		// public >> protected >> default >> private
		// public : 어디서든 가져다 쓸 수 있다.
		// protected : 동일 패키지 내에서 가능 또는 상속을 받으면 가능
		// default : 동일 패키지 내에서 가능
		// private : 자기 자신 안에서만 가능
		
//		Unit marine = new Unit("marine", 50, 10);
//		System.out.println(marine.getHp());
//		Unit 저글링 = new Unit("저글링", 30, 5);
//		marine.getDamage(저글링);
//		System.out.println(marine.getHp());
		
		Unit marine = new Marine();
        Unit zealout = new Zealout();
        for (int i = 0; i < 5; i++) {
            zealout.getDamage(marine);
            System.out.println(zealout.getHp());
        }
        System.out.println(marine.getId() + " " + zealout.getId()); // 생성될 때마다 1씩 증가하니 1 2 출력
	}

}
