package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {

		//문자열
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");

		// \t : 출력시 탭만큼 띄움 \n : 출력시 줄바꿈(이스케이프 문자)
		//print : 출력시 나란히 , println : 출력 후 줄 바꿔줘
	}

}
