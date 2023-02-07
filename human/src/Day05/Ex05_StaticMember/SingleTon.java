package Day05.Ex05_StaticMember;
/*
 싱글톤 패턴
 - 디자인 패턴 중의 하나로 프로그램이 시작될때 최초로 한 번만 메모리를 할당해서 
 인스턴스를 사용하는 패턴
 - 객체가 피요할 때 새로운 객체를 생성라지 않고 기존의 인스턴스를 활용하는 코드의 패턴
 - 객체를 하나만 생성하기 때문에, 메모리를 효울적으로 사용할 수 있다.
 */
public class SingleTon {
	
	private static SingleTon instance = new SingleTon();
	
	//생성자를 private 으로 정의
	private SingleTon() {
		
	}

	//인스천스 (객체)가 생성되지 않앗다면, 생성해주고
	//이미 생성되어 있으면, 생성된 인스턴스를 반환한다.
	public static SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon();
			
		}
		return instance;
	}
}
