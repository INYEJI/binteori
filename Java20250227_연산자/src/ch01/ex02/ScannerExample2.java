package ch01.ex02;

import java.util.Scanner;

//키보드를 통해서 입력을 받을 경우

//import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {

		System.out.print("문자 입력 : "); 
		
		Scanner sc = new Scanner(System.in); 
		
		String str = sc.nextLine(); 
		
		str = str + 10; //문자 10 + 정수10 그대로 연결 1010
		
		System.out.println("입력된 값 : " + str); 
		
	//1) int str = integer.parseInt(sc.nextLine())
	//2) 처음부터 int형으로 받기
		
		System.out.print("문자 입력 : "); 
		
		Scanner sc2 = new Scanner(System.in); 
		
		int str2 = Integer.parseInt(sc2.nextLine());
		
		str2 = str2 + 10; 
		
		System.out.println("입력된 값 : " + str2); 
		
		

		
	}

}
