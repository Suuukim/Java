package example01;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		// Scanner 클래스 이용
		// ==> 입력을 받기 위한 클래스이다.
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 > ");
//		int num = sc.nextInt();  // 정수를 입력 받음.
//		System.out.println("사용자로부터 입력받은 숫자 : " + num);
	
//		System.out.print("실수 입력 > ");
//		double dnum = sc.nextDouble(); // 실수를 입력받음
//		System.out.println("사용자로부터 입력받은 숫자(실수) : " + dnum);
	
		// 문자열 받기 ==> next(), nexxtLine()
//		System.out.print("문자열 입력 > ");
//		String str = sc.next();
//		System.out.println("입력받은 문자열 : " + str);
		
		System.out.print("문자열 입력 > ");
		String str1 = sc.nextLine();
		System.out.println("입력받은 문자열 : " + str1);
		
	}
}
