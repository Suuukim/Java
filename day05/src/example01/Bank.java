package example01;

import java.util.Scanner;

/*
 * [은행관련 프로그램]
 * 	초기비용 10000원
 * 	int money = 10000;
 * 1.입금 	2.출금	3.종료
 * 가지고 있는 돈이 500000원을 넘는다면
 * '최대 예금액을 초과하였습니다. 임급할 수 있는 금액은 얼마입니다.'
 * 		>> 49000원이 있다고 가정할 때 3000원을 넘으면
 *  	>> 최대 예금액을 초과하였습니다. 입금할 수 있는 금액은 1000원입니다.
 *  
 *  가지고 있는 돈보다 출금액이 더 크다면
 *  '출금할 수있는 최대금액보다 초과하였습니다. 출금할 수 있는 금액은 얼마입니다.'
 *  	>> 5000원이 있다고 가정할 때 10000원을 출금한다고 하면
 *  	>> 출금할 수 있는 최대금액보다 초과하였습니다. 출금할 수 있는 금액은 5000원입니다.
 *  종료버튼을 눌렀을 시
 *  "남은 잔액은 얼마입니다";
 * 
 */
public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 10000;	// 초기 비용
		int maxMoney = 50000;	// 최대 임급 가능 금액
		int menu = 0;		// 메뉴 버튼
		int inputMoney = 0;		// 입금액
		int outputMoney = 0;	// 출금액
		
		while(true) {
			System.out.println("메뉴 1.입금   2.출금   3.종료");
			System.out.print("메뉴를 선택하세요 >> ");
			menu = sc.nextInt();
			
			if(menu == 3) {
				System.out.printf("최종 남은 잔액은 %d원입니다. \n", money);
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}else if(menu ==1) { // 입금 메뉴를 선택했을 때
				System.out.print("얼마를 입금하시겠습니까 >> ");
				inputMoney = sc.nextInt();
				if((money + inputMoney) > maxMoney) {
					System.out.printf("최대 예금액을 초과하였습니다. 입금할 수 있는 금액은 $d원입니다. \n", maxMoney + money);
				}else {
					money += inputMoney;
					System.out.println("입금 성공!!!, 입금 후 현재 잔액 : " + money);
				}
			}else if(menu == 2) {
				System.out.print("얼마를 출금하시겠습니까 >> ");
				outputMoney = sc.nextInt();
				if((money - outputMoney) < 0) {
					System.out.printf("출금할 수 있는 최대 금액보다 초과하였습니다. 출금할 수 있는 금액은 %d원입니다.\n", money);
				}else {
					money -= outputMoney;
					System.out.println("출금성공!!, 출금 후 현재 잔액 : " + money);
				}
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
			}
			
		}
	}
}
