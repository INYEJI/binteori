package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println("result1: " + result1); //컴파일 단계에서 연산

		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; //int 타입으로 변환
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; //long 타입으로 변환
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7; //char -> int 타입으로 변환
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
		
		int v8 = 10;
		int result5 = v8 / 4; //정수 연산 결과는 정수(소숫점 버림)
		System.out.println("result5: " + result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0; //int->double 타입으로 변환
		System.out.println("result6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double)v10/v11; 
		System.out.println("result7: " + result7);
	}

}
//정수 + 정수 = 정수 , 정수 + 실수 = 실수, 실수 + 실수 = 실수
//정수 + 문자열 = 문자열 , 실수 + 문자열 = 문자열 (정수나 실수를 문자로 해석), String
//괄호를 먼저 연산 후 왼->오 방향으로 연산
//"숫자" 처럼 생긴 문자열을 숫자 타입으로 변경 시에, int value = Integer.paseInt(str) 를 통해 변경
//{ } 블록 범위 내에서는 변수 중복 선언 불가능, 특정 블록 내부에서만 사용하면 해당 블록 내에서 선언