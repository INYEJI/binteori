package ch01.ex01;

public class PrintfExample {

	public static void main(String[] args) {
		
		System.out.print("Hello Java"); //줄바꿈 없음
		System.out.print("Hello Java");
		System.out.println(); //줄바꿈 있음
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println();
		System.out.printf("Hello,Java\n"); //줄바꿈 기능이 없지만 바꾸기 위해 \n 붙임
		System.out.printf("Hello,Java");	
		System.out.println();
		
		int a = 10;
		int b = 20;
		double c = 10.257;
		
		System.out.println("a = " + a + ", b = " + b + ", C = " + c); //문자열 = 변수값	
		System.out.printf("a = %d, b = %d, c=%.2f\n",  a , b , c ); // ("%d , %d" , a , b) 순서대로 대입 * d = 정수형, s = 문자형, f = 실수형
		System.out.println(); 
		
		int a1 = 10;
		int a2 = 100;
		int a3 = 1000;
		int a4 = 10000;
		int a5 = 100000;
		
		int b1 = 10;
		int b2 = 100;
		int b3 = 1000;
		int b4 = 10000;
		int b5 = 100000;
		
		System.out.println("a1=" + a1 + ",b1=" + b1);
		System.out.println("a2=" + a2 + ",b2=" + b2);
		System.out.println("a3=" + a3 + ",b3=" + b3);
		System.out.println("a4=" + a4 + ",b4=" + b4);
		System.out.println("a5=" + a5 + ",b5=" + b5);
		System.out.println();
		
		System.out.printf("a1=%-6d,b1 = %d\n" , a1,b1); //6d : 전체자릿수 = 6자리를 확보 후, 왼쪽 빈자리 공백
		System.out.printf("a2=%-6d,b2 = %d\n" , a2,b2); //-6d : 전체자릿수 = 6자리를 확보 후, 오른쪽 빈자리 공백
		System.out.printf("a3=%-6d,b3 = %d\n" , a3,b3); //06d : 전체자릿수 = 6자리를 확보 후, 왼쪽 빈자리 0으로 채움
		System.out.printf("a4=%-6d,b4 = %d\n" , a4,b4);
		System.out.printf("a5=%-6d,b5 = %d\n" , a5,b5);
		System.out.println();
		
		String str = "Hello";
		System.out.println("str=" + str); //문자열은 2개 이상시 값의 순번을 매겨줘야함 &1$s
		System.out.printf("str=%s\n",str);
		
		
		
	}

}
