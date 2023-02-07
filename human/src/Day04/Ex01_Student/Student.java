package Day04.Ex01_Student;

public class Student {

	// 학생의 속성 : 이름, 나이, 학번, 전공
	String name;
	int age;
	String stdNo;
	String major;

	// 생성자
	public Student() {
	}

	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}

	// 메소드
	// - 공부하기
	// - 성적 평균 구하기
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
		// 변환타입이 void이면, return을 생략해도 된다.
	}

	public double getAverage(int score1, int score2) {
		double average = 0.0;
		// (평균) = (합계) / (개수)
		average = (double) (score1 + score2) / 2;
		return average;
	}
	
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		// (평균) = (합계) / (개수)
		average = (double) (score1 + score2 + score3) / 3;
		return average;
	}
	public double getAverage(int[] scores) {
		double average = 0.0;
		int sum = 0;
		for (int score : scores){
			sum+=score;
		}
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
		average = (double) sum/ scores.length;
		return average;
	}
	
}
