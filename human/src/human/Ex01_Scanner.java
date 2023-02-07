package human;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		System.out.println(sc.nextInt());
		
		sc.close();
	}
}