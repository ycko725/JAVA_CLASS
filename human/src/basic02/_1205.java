package basic02;

import java.util.Scanner;

public class _1205 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();

		double c = a + b;
		double d = b + a;
		double e = a - b;
		double f = b - a;
		double g = a * b;
		double h = a / b;
		double i = b / a;
		double j = Math.pow(a, b);
		double l = Math.pow(b, a);

		double arr[] = { c, d, e, f, g, h, i, j, l};
		double max = Integer.MIN_VALUE;
		for (int k = 0; k < arr.length; ++k) {
			max = Math.max(max, arr[k]);
		}
		System.out.printf("%.6f", max);
		sc.close();
	}
}