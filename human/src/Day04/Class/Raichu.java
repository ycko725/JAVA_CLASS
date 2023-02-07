package Day04.Class;
//상속
//-키워드 : 자식클래스 extends 부모클래스 {}

public class Raichu extends Pikachu {

	// alt + shift + S -> C
	public Raichu() {
		super(200, "메가전기");
	}

	public Raichu(int energy, String type) {
		super(energy, type);
	}
	//메소드 오버라이딩 : 메소드 재정의
	//오버라이딩 자동 완성 : alt + shift + s -> v
	public String aAttack() {
		return "백만볼트";
	}

	
	@Override
	public String bAttack() {
		return "볼트체인지"
				;
	}
	
	
}
