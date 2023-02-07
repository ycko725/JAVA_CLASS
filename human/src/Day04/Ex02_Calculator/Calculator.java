package Day04.Ex02_Calculator;

/**
 * 계산기 - 피연산자를 2개로 하는 계산기 - 기능 1. 덧셈 : 정수 2개를 덧셈 2. 뺄샘 : 정수 인자 1 - 인자 2 3. 곱셈 :
 * 정수 2개를 덧셈 4. 나눗셈 : 실수 인자 1 / 인자 2 연산하는 나눗셈 5. 나머지 : 정수 인자 1 % 인자 2 6. 합계 :배열을
 * 매개변수로 전잘받아, 모든 요소의 합을 구함 7/ 평균 : 배열을 매개변수로 전잘받아, 평균을 수함
 * 
 * @author h
 *
 */
public class Calculator {
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}

	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	public double multiple(double a, double b) {
		double result = a * b;
		return result;

	}

	public double divide (double a, double b) {
		double result = a / b;
		return result;
		
	}
	
	public int remain (int a, int b) {
		int result = a % b;
		return result;
		
	}

	public int sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	public double avg(int[]arr) {
		int sum = sum(arr);
		double avg=(double)sum/arr.length;
		return avg;
	}
}