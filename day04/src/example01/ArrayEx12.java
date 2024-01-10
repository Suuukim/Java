package example01;

public class ArrayEx12 {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100,},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,51,50}
		};
		int sum = 0;
		float avg = 0.0f;
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================");
		
		for(int i=0;i<score.length;i++) {
			System.out.print(" " + (i+1));
			for(int j=0;j<score[i].length;j++) {
				sum += score[i][j];
				System.out.print("\t" + score[i][j]);
			}
			avg = sum / (float)score[i].length;
			System.out.println("\t"+sum+"\t"+avg);
		}
	}
}
