package example01;

import java.util.Arrays;

public class ArrayEx7 {
	public static void main(String[] args) {
		// 배열 요소 섞기 (shuffle)
		int[] numArr = new int[10];
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = i;
		}
		System.out.println("[섞기 전]");
		System.out.println(Arrays.toString(numArr));
		System.out.println();
		
		for(int i=0;i<100;i++) {
			int n = (int)(Math.random() * 10);	// n의 범위 : 0 ~ 9
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		/*
		 * n == 3
		 * tmp == 0
		 * numArr[0] == 3 (numArr[3] == 3)
		 * numArr[3] == 0
		 */
		
		System.out.println("[섞은 후]");
		System.out.println(Arrays.toString(numArr));
		
	}
}
