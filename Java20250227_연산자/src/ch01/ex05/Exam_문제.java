package ch01.ex05;

import java.util.Scanner;

public class Exam_문제 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값 입력 : ");
		String str = sc.nextLine();
		int x = Integer.parseInt(str);
		
		int time = x/3600;
		int min = (x%3600) / 60 ;
		int sec1 = x%60;
		
		
		System.out.printf("%d시간 %d분 %d초", time, min, sec1);

	}

}
//int x = sc.nextInt() : 정수만 입력시