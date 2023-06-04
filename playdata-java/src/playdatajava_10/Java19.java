package playdatajava_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java19 {
	
	static Map<String, String> map = new HashMap<>();
	static Scanner sc;

	public static void main(String[] args) {
		
		sc= new Scanner(System.in);
		input();
		
		// 입력을 받아서
		// apple 사과
		// banana 바나나
		// 저장
			

	} // main의 끝
	
	
	
	public static void input() {
		int i = Integer.parseInt(sc.nextLine());
		System.out.println("1. insert 2. delete 3. update");
		System.out.println("4. find 5. exit");
		modeSelect(i);
		
		
	}
	
	public static void insert() {
		String key = sc.nextLine();
		System.out.println("영단어 입력");
		
		String value = sc.nextLine();
		System.out.println("한국어 입력");
		if (isValid(key, true)) map.put(key, value);
		input();
	}
	
	public static void delete() {
		// 키를 보여주고 키를 입력하고 value 삭제
		String key = sc.nextLine();
		map.remove(key);
		input(); // 입력 초기화를 해줘야 하기 때문에 input();
	}
	
	public static void update() {
		// 키를 보여주고 키를 입력하고 value 업데이트
		String key = sc.nextLine();
		System.out.println("키 입력");
		String value = sc.nextLine();
		System.out.println("바꿀 내용 입력");
		if (isValid(key)) map.put(key, value);
		input(); // 입력 초기화를 해줘야 하기 때문에 input();
	}
	
	public static void find() {
		// 키를 보여주고 키를 입력하고 value 찾기
		String key = sc.nextLine();
		System.out.println("키 입력");
		if(isValid(key))
			System.out.println("key : " + key + ", value : " + map.get(key));
		else
			System.out.println("없는 단어");
		input(); // 입력 초기화를 해줘야 하기 때문에 input();
	}
	
	public static boolean isValid(String key) {
		if(map.containsKey(key))
			return true;
		System.out.println(key + "로 된 단어는 없습니다.");
		return false;
	}
	
	public static boolean isValid (String key, boolean isInsert) {
		if(!map.containsKey(key)) return true;
		System.out.println("있는 단어");
		// banana는 바나나라고 있는 단어입니다.
		return false;
	}
	
	public static void modeSelect(int mode) {
		switch (mode) {
		case 1:
			insert(); break;
		case 2:
			delete(); break;
		case 3:
			update(); break;
		case 4:
			find(); break;
		case 5:
			break;
		default:
			input(); break;
	} // switch의 끝
		
	} // modeSelect의 끝
}
