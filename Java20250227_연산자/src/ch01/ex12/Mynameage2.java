package ch01.ex12;

import java.util.Scanner;

public class Mynameage2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine(); 
		//System.out.println("이름 : " + name);
		
		System.out.println();
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		//System.out.println("나이 : " + age + "살");
		
		System.out.println();
		
		System.out.printf("이름 : %1$s, 나이 : %2$d", name, age);

	}

}
