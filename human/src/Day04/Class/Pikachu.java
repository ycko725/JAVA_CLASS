package Day04.Class;
// classification 
public class Pikachu {
	//클래스		:겍체를 정의하는 설계도
	//멤버		:변수, 메소드
	
	//변수
	public int energy;
	public String type;
	//생성자
	public Pikachu() {
		energy = 100;		type = "전기";
	}
	

	public Pikachu(int energy, String type) {
		super();
		this.energy = energy;
		this.type = type;
	}

//	public Pikachu (int energy, String type) {
		//this : 객체 자기 자신을 가리키는 러퍼런스
//		this.energy = energy;
//				this.type  = type;
//	}
	//메소드
	//접근지정자 반환타입 메소드명 ( 매개변수 )
	public String aAttack() {
		return "십만볼트";
	}
	public String bAttack() {
		return "전광석화";
	}
}
