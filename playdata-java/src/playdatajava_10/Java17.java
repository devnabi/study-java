package playdatajava_10;

import java.util.Arrays;
import java.util.Scanner;

public class Java17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] st = new String[4];
		
		
//		// 라벨링
//		Loop  : while (true) {
//		}
		
		
		for(int i = 0; i < st.length; i++) {
			System.out.println("이름입력");
			st[i] = sc.nextLine();
			
			String line = sc.nextLine();
			System.out.println("나이입력");
			
			String line2 = sc.nextLine();
			int age = Integer.parseInt(line2);
			
			st[i] = line;
			if(line.equals("q"));
			
		}
		
		System.out.println(Arrays.toString(st));
		System.out.println("end");
		
	}
	
}
