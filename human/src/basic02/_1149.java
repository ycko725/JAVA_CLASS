package basic02;

import java.util.Scanner;

public class _1149 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//int result = a > b ? a : b;
		//sysout("result");
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		sc.close();
	}
}