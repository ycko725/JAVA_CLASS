package Day03;

import java.util.Scanner;

public class Ex02_Max {
	public static void main(String[] args) {
		// 첫째줄에 입력할 개수 N을 입력받고 둘째의 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최대값을 구하여 출력하시오
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}

		}
		System.out.println("최대값 : " + max);
		sc.close();
	}
}
