package example01;

import java.util.Scanner;

public class OeratorEx8 {
	public static void main(String[] args) {
		// 삼항연산자
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 점수를 입력하세요 > ");
		int score = sc.nextInt();
		
		char grade = (score >= 90) ? 'A' : 'B';
		System.out.println("당신의 등급은 : " + grade);
		
		grade = (score >= 90) ? 'A' : ( (score >= 80) ? 'B' : 'C');
		System.out.println("당신의 최종등급은 : " + grade);
		
	}
}
