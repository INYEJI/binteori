package ch01.ex03;
//변수 단독으로 증감 연산자 사용 시
public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// 증가연산자 ++ 1씩 증가
		// 감소연산자 -- 1씩 감소
		
		int a = 0;
		System.out.println(a);		
		a = a + 1;
		System.out.println(a);	
		a = a + 1;
		System.out.println(a);	
		
		System.out.println();
		
		int b = 0;
		System.out.println(b);
		++b; //b = b + 1, 전위 (연산자가 앞에) 
		System.out.println(b);
		b++; //b = b + 1, 후위(연산자가 뒤에)
		System.out.println(b);
//전위=후위 결과 동일
		
	}

}
