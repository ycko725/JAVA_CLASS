package Work;

import java.util.Scanner;

public class javamission6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? : ");
		int N = sc.nextInt();

		for (int x = 0; x < N; x++) {
			System.out.print("[" + (x + 1) + " 게임]" + " ");
			
			int arr[] = new int[6];

			for (int i = 0; i < arr.length; i++) {
				int random = (int) (Math.random() * 45 + 1);
				arr[i] = random;

				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j])
						continue;
					if (arr[j] == random) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}

				}

			}
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			sc.close();
		}

	}
}
