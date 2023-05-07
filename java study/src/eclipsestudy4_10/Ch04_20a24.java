package eclipsestudy4_10;

import java.util.*;

public class Ch04_20a24 {

	public static void main(String[] args) {
		// 4-20 ~ 4-24 break문, continue문, 이름 붙은 반복문
		
		// break : 자신이 속한 하나의 반복문을 벗어난다.
		// while의 무한반복문 (true) / for의 무한반복문 (;true;), (;;)
		// continue : 자신이 포함된 반복문의 끝으로 이동(다음 반복으로 넘어감)
		// 이름 붙은 반복문 : 이름을 붙여서 하나 이상의 반복문을 벗어날 수 있다. / 자주 사용하지는 않는다. 있다는 것만 알아두자.
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) {
				break;
			}
			i++;
			sum += i; // 조건을 만족하게 되면(sum이 100보다 큰 수까지 증가를 했다면) break가 수행되어 while을 빠져나온다.
		} // while의 끝
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
		
		for(int j = 0; j <= 10; j++) {
			if(j%2 == 0) {
				continue;
			}
			System.out.println(j);
		} // for의 끝
		
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 사과");
			System.out.println("2. 귤");
			System.out.println("3. 포도");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료 : 0) > ");
		
		String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
		menu = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
//		menu = Integer.parseInt(scn.nextLine()); 한줄로 가능하다.
		
		if(menu == 0) {
			System.out.println("종료합니다.");
			break;
		}
		else if(!(1 <= menu && menu <= 3)) {
			System.out.println("메뉴를 잘못 선택하셨습니다. 종료는 0.");
			continue;
		}
		
		System.out.println("선택하신 메뉴는 "+ menu + "번 입니다.");
		}// while의 끝
	}

}
