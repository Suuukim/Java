package example01;

public class FlowEx1 {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("x = " + x + " 일 때 참인것은?");
		
		if(x==0) {	// 참
			System.out.println("1번 x == 0");
		}
		
		if(x != 0) {	// 거짓(false
			System.out.println("2번 x != 0");
		}
		
		if(!(x == 0)) {	// 거짓(false)
			System.out.println("3번 !(x == 0)");
		}
		
		if(!(x != 0) ) {	// 참 (true)
			System.out.println("4번 ! ( x != 0)");
		}
	}
}
