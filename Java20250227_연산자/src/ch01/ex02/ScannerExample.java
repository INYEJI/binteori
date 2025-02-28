package ch01.ex02;

import java.util.Scanner;

//키보드를 통해서 입력을 받을 경우

//import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		System.out.print("문자 입력 : "); 
		
		Scanner sc = new Scanner(System.in); //스캐너 변수를 선언하고(값을 스캔하는) scanner 객체를 생성, 값을 받을 때까지 대기 상태
		
		String str = sc.nextLine(); //메모리 공간에 입력 받은 값을 문자열로 읽고 저장
		
		System.out.println("입력된 값 : " + str); //입력된 값을 출력 (str이 입력된 값을 나타냄)
		
		
		
		System.out.print("정수 입력 : ");
		
		int num = sc.nextInt(); //int를 사용했기 때문에 정수(int)만 받을 수 있고 출력도 int형
		
		System.out.println("입력된 값 : " + num);
		
		

		
	}

}
