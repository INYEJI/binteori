package ch02.sec07;

public class PromotionExample {
//refactor > rename 을 통해 class명과 파일명(소스명)을 일치 시켜줌
	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: "  + doubleValue);		
	}

}
//타입이 다른 경우 타입을 먼저 일치시키고(자동변환) 연산

//강제 타입 변환 시, 괄호를 이용해 쪼개 넣음 =>  (작은허용범위타입)큰허용범위타입
//허용범위 이상은 버려짐(원래값 보존 안됨)