package ch02.sec01; //패키지명(경로)

public class VariableExam { //클래스명

	public static void main(String[] args) { //시작점
		
		int value = 10; //변수 선언 후 값 할당 = 메모리 공간 안에 값 저장 = 변수 초기화와 초기값
//value : 변수명 영소문자,숫자,특수문자_ 숫자가 맨 앞에 올 수는 없음 *만약 대문자로 되어있을 경우 상수화 , final을 붙일 시 변하지 않음(상수)
		//korScore (카멜표기법) kor_score(스네이크표기법)
//int : 정수만 입력
		int result = value + 10;
		
		System.out.println(result);
		
	}

}

//초기화 되지 않은 변수를 연산식에 사용 시 컴파일 에러

//8bit = 1byte