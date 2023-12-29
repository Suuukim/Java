package example01;

public class FlowEx9 {
	public static void main(String[] args) {
		// 이중 for문
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%3d X %d = %d\n", i, j, i*j);
				}
			System.out.println();
			}	
				
			
	}
}
