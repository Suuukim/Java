package example01;

import java.util.Scanner;

public class FlowEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("출력할 라인수를 입력하세요 > ");
		num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * i == 0
		 * for(int j=0; j<=0; j++) {}
		 * 
		 * i == 1
		 * for(int j=0; j<=1; j++) {}
		 * 
		 * ...
		 * i == 9
		 * for(int j=0; j<=9; j++) {}
		 */
	}
}
