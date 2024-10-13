package java_new;

public class Chap02_EXER2 {
	public static void main(String[] args) {
		// 문제 1. 기본 데이터 타입 - 자바의 기본 데이터 타입 4가지를 나열하고, 각 데이터 타입의 크기를 설명하시오.
		// byte : 1, char : 2, int : 4, double : 8
		
		
		// 문제 2. 변수 선언 - 정수형 변수 `age`와 실수형 변수 `height`를 선언하고 초기값으로 각각 25와 175.5를 할당하는 코드를 작성하시오. 
		 int age = 25;
		 double height = 175.5;
//		 System.out.println(age);
//		 System.out.println(height);
		
		// 문제 3. 변수 값 변경 - 문제 2에서 선언한 변수 `age`의 값을 30으로 변경하는 코드를 작성하시오.
		age = 30;
//		System.out.println(age);
		
		// 문제 4. 문자형 변수 - 문자형 변수 `initial`을 선언하고, 초기값으로 'J'를 할당하는 코드를 작성하시오.
		char initial = 'J';
//		System.out.println(initial);
		
		// 문제 5. 문자열 변수 - 문자열 변수 `name`을 선언하고, 초기값으로 "홍길동"을 할당하는 코드를 작성하시오.
		String name = "홍길동";
//		System.out.println(name);
		
		// 문제 6. 진법 변환 - 10진수 255를 2진수와 16진수로 변환한 값을 각각 작성하시오.
		// 2진수 : 11111111
		// 16진수 : FF
//		System.out.printf("%s%n", Integer.toBinaryString(255));
//		System.out.printf("%X%n", 255);
//		System.out.println();
		
		// 문제 7. 자바에서의 진법 표현 - 다음 수를 자바 코드로 2진수와 16진수로 표현하시오: 42
		System.out.printf("%s%n", Integer.toBinaryString(42));
		System.out.printf("%X%n", 42);
		System.out.println();		
		
		// 문제 8. 변수와 데이터 타입 - 다음 코드의 오류를 찾아 수정하시오 : int num = "100";
		int num = 100;			
		
		// 문제 9. 타입 변환 - 5.8이라는 실수형 변수를 정수형으로 변환하고 출력하는 코드를 작성하시오. (결과는 5)
		double d = 5.8;
		int i = (int)d;
		System.out.println(i);
		System.out.println();
		
		
		// 문제 10. 진법 계산기 - 10진수 10과 2진수 1010을 더한 결과를 10진수로 계산하시오.
		int a = 10;
		int b = 0b1010;
		System.out.println(a + b);
		
	}
}
