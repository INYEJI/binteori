package ch02.sec01;

public class CharExample {

	public static void main(String[] args) {
		//문자(1글자)
		char c1 = 'A'; //큰따옴표는 안 됨, 문자 저장
		char c2 = 65; //유니코드 직접 저장 10진수 
		
		char c3 = '가';
		char c4 = 44032; //16진수 0x____
		
		//ctrl+shift+방향기 아래
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		//alt+방향키
	}

}
//문자열 타입(1글자 이상) => string()과 "큰따옴표"사용