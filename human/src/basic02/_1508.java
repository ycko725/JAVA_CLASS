package basic02;

import java.util.Scanner;

public class _1508 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	
	int[][] arr = new int [20][20];
	
	for (int i = 0; i < N; i++) {
		arr[i][0] = sc.nextInt();
		
	}
	for (int i = 0; i < N; i ++) {
		for (int j = 0; j <= i; j++) {
			arr[i+1][j+1] = arr[i+1][j] - arr[i][j];
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	sc.close();
}
}
