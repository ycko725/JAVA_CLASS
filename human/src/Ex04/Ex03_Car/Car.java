package Ex04.Ex03_Car;

public class Car {

	String model;
	private int speed;

	Car() {

	}

	Car(String model) {
		this.model = model;
	}
	Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	// getter: 변수의 값을 가져오는 메소드
	// setter : 변수의 값을 저장하는 메소드
	// 게터/세터 이름 : getName(), setName()
	// - get/set 뒤에 변수명을 첫글자를 대문로해서 메소드명을 정의

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			speed = 0;
		}
		if (speed >= 300) {
			speed = 300;
		}
		this.speed = speed;
	}
}
