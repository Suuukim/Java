package example01;

public class VarEx1 {
	public static void main(String[] args) {
		// 변수의 선언과 초기화
		int x = 10;
		int y = 20;
		int tmp = 0;
		
//		System.out.println(x);
//		System.out.println(y);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("================");
		// 정수 + 문자열	==> 문자열
		// 문자열 + 정수	==> 문자열
		// 문자열 + 문자열 	==> 문자열
		
		
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
