package ch01.ex06;

public class OverflowExample {

	public static void main(String[] args) {

		short num1 = 32767;
		short num2 = -32768;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1++; //num = num + 1 최댓값 초과(오버플로우)인 경우 다시 최솟값으로 돌아간다 그 이후에 +
		System.out.println(num1);
		
		num2--; //num = num - 1 최솟값 미만(언더플로우)인 경우 최댓값으로 돌아간다 그 이후에 -
		System.out.println(num2);

	}

}
