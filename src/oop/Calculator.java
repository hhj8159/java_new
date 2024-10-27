package oop;

import java.util.Scanner;

public class Calculator {	
	public static void main(String[] args) {
		// switch
		// 사용자로부터 입력 스캐너
		// 숫자 두개, 부호도 입력
		// 반환된 값을 여기서 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = Integer.parseInt(scanner.nextLine());
		System.out.println("연산 기호를 입력하세요");
		String opr = scanner.nextLine() ;
		
		Calc calc = new Calc();
				
		switch (opr) {
		case "+":
			System.out.println(calc.add(num1, num2));
			break;
		case "-":
			System.out.println(calc.sub(num1, num2));
			break;
		case "*":
			System.out.println(calc.mul(num1, num2));
			break;
		case "/":
			System.out.println(calc.div(num1, num2));
			break;
		case "%":
			System.out.println(calc.mod(num1, num2));
			break;
		default:
			break;
		}
	}
}

class Calc{
	// 인스턴스 메서드 구현

	// 반환 해야함
	// 더하기 파라미터 두개
	int add(int a, int b) {
		return a + b;
	}	
	
	// 빼기
	int sub(int a, int b) {
		return a - b;
	}	
	
	// 곱하기
	int mul(int a, int b) {
		return a * b;
	}	
	
	// 나누기
	int div(int a, int b) {
		return a / b;
	}	
	
	// 나머지
	int mod(int a, int b) {
		return a % b;
	}	
}
