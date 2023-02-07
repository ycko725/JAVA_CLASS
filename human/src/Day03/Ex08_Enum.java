package Day03;
//열거체 (enum) 정의
enum Rainbow {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}
public class Ex08_Enum {
	public static void main(String[] args) {
		//ENUM (열거체)
		// - 요소들을 명명한 값으로 집합을 이룬 자료형
		//특징
		//1. enum을 비교할 때는 값뿐만 아니라 타입도 비교한다
		//2. enum을 상수 값이 재정의 되도 다시 컴파일할 필요가 없다
		
		//values () : 열거체 모든 요소를 배열로 반환
		Rainbow[] rainbow = Rainbow.values();
		for(Rainbow color : rainbow) {
			System.out.print(color + " ");
		}
		System.out.println();
		
		//valuesOf() : 전달된 문자열과 일치하는 열거체 상수를 변환
		Rainbow G = Rainbow.valueOf("GREEN");
		System.out.println("G : " + G);
		
		//orinal() : 해당 열거체 상수가 정의된 순서 index를 변환
		int index= G.ordinal();
		System.out.println("GREEN 의 index : " + index);
		
		}
}
