package java_new;

import java.util.Scanner;

public class Chap04_EXER2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int input = Integer.parseInt(scanner.nextLine());  nextInt쓰지말고 인티저 파스인트로 형변환해
//		String str =  input + ""; 문자열 형변환
		
//		### 1. 간단한 `if-else` 사용
//		사용자로부터 정수를 입력받아, 이 정수가 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.
		
//		System.out.print("정수 입력 > ");
		int a = 10;
		
		if(a % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		System.out.println();
		
//		### 2. 중첩 `if-else` 사용
//		사용자로부터 3개의 정수를 입력받아, 가장 큰 수를 출력하는 프로그램을 작성하세요.		
//		System.out.print("정수 입력 > ");		
		int num1 = 3;
//		System.out.print("정수 입력 > ");	
		int num2 = 90;
//		System.out.print("정수 입력 > ");	
		int num3 = 20;
		
		// 최대값 구하기
		int max = num3;
		if(max < num2) {
			max = num2;
		}
		if(max < num1) {
			max = num1;
		}
		System.out.println(max);
		
		
//		if(num1 >= num2) {
//			if(num1 >= num3) {
//				System.out.println(num1);				
//			}
//			else {
//				System.out.println(num3);
//			}
//		}
//		else if (num2 >= num3){
//			System.out.println(num2);
//		}
//		else {
//			System.out.println(num3);
//		}
//		System.out.println();
	
		
//		### 3. `if-else`와 논리 연산자 사용
//		사용자가 입력한 나이가 18세 이상이면 "성인입니다"를 출력하고, 그렇지 않으면 "미성년자입니다"를 출력하는 프로그램을 작성하세요.
//		System.out.print("나이 입력 > ");
		int age = 18;		
		if(age >= 18) {
			System.out.println("성인입니다");
		}
		else {
			System.out.println("미성년자입니다");
		}
		System.out.println();
		
//		### 4. `if-else`를 사용한 학점 계산
//		학생의 점수를 입력받아 다음과 같은 학점을 출력하는 프로그램을 작성하세요:
//		- 90점 이상: A
//		- 80점 이상: B
//		- 70점 이상: C
//		- 60점 이상: D
//		- 그 외: F
//		System.out.print("점수 입력 > ");
		int score = 89;		
		
		if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		System.out.println();
		
//		### 5. `switch`문을 이용한 요일 출력
//		사용자로부터 1~7 사이의 숫자를 입력받아, 해당 숫자에 맞는 요일을 출력하는 프로그램을 작성하세요.
//		- 1: 월요일
//		- 2: 화요일
//		- 3: 수요일
//		- 4: 목요일
//		- 5: 금요일
//		- 6: 토요일
//		- 7: 일요일		
		
//		System.out.print("1~7사이의 숫자를 입력하세요 > ");		
		int day = 1;//		
		switch(day) {
			case 1:
				System.out.println("월요일");
				break;
			case 2:
				System.out.println("화요일");
				break;
			case 3:
				System.out.println("수요일");
				break;
			case 4:
				System.out.println("목요일");
				break;
			case 5:
				System.out.println("금요일");
				break;
			case 6:
				System.out.println("토요일");
				break;
			default :
				System.out.println("일요일");
		}
		System.out.println();
		
//		### 6. 중첩된 `if-else`문을 사용하여 로그인 검사
//		사용자로부터 입력받은 아이디와 비밀번호를 비교하여, 맞으면 "로그인 성공", 틀리면 "로그인 실패"를 출력하는 프로그램을 작성하세요.
		System.out.print("ID > ");			
		String correctid = "1234";
		String enteredid = scanner.nextLine();
		
		if(correctid.equals(enteredid)) {
			System.out.print("PW > ");
			String correctpw = "1234";
			String enteredpw = scanner.nextLine();
			if(correctpw.equals(enteredpw)) {		
				System.out.println("로그인 성공");
			}
//			else {
//				System.out.println("로그인 실패");				
//			}
		}
//		else {
//			System.out.println("로그인 실패");
//		}
//		if(correctid.equals(enteredid) && correctpw.equals(enteredpw)) {
//			System.out.print("PW > ");
//			String correctpw = "1234";
//			String enteredpw = scanner.nextLine();
////			if(correctpw.equals(enteredpw)) {		
////				System.out.println("로그인 성공");
////			}
////			else {
////				System.out.println("로그인 실패");				
////			}
//		}
//		else {
//			System.out.println("로그인 실패");
//		}
		System.out.println();
		
//		### 7. `if-else`를 사용한 세금 계산
//		연봉을 입력받아 다음 규칙에 따라 세금을 계산하는 프로그램을 작성하세요:
//		- 연봉이 5천만 원 이하: 10% 세율
//		- 연봉이 5천만 원 초과 1억 원 이하: 20% 세율
//		- 연봉이 1억 원 초과: 30% 세율
//		System.out.print("연봉 입력 > ");		
		long sal = 180000000;
		
		if(sal <= 50000000) {
			System.out.println("세율 10% > " + (long)(sal * 0.1));
		}
		else if(sal <= 100000000) {
			System.out.println("세율 30% > " + (long)(sal * 0.3));
		}
		else{
			System.out.println("세율 20% > " + (long)(sal * 0.2));
		}
		System.out.println();
		
		long sal1 = 80_000_000L;
		if(sal > 100_000_000) {
			System.out.println("세율 30% > " + (long)(sal * 0.3));
		}
		else if(sal > 50000000) {
			System.out.println("세율 20% > " + (long)(sal * 0.2));
		}
		else {
			System.out.println("세율 10% > " + (long)(sal * 0.1));
		}
		
		
//		### 8. `switch`문을 이용한 간단한 계산기
//		사용자로부터 두 개의 숫자와 연산자(+, -, *, /)를 입력받아 결과를 출력하는 프로그램을 작성하세요.
//		System.out.print("두 개의 숫자와 연산자 입력 > ");			
		double num4 = 3;		
		double num5 = 4;		
		String operator = "/";
		
		switch(operator) {
			case "+":
				System.out.println(num4 + num5);
				break;
			case "-":
				System.out.println(num4 - num5);
				break;
			case "*":
				System.out.println(num4 * num5);
				break;
			case "/":
				System.out.println(num4 / num5);
				break;
			default :
				System.out.println("올바른 값을 입력하세요");
		}
		System.out.println();
		
		
//		### 9. `if-else`로 음수, 양수, 0 판별
//		정수를 입력받아 해당 숫자가 양수, 음수 또는 0인지 판별하는 프로그램을 작성하세요.
//		System.out.print("정수를 입력하세요 > ");		
		int integer	= -1;
		
		if(integer < 0) {
			System.out.println("음수");
		}
		else if(integer == 0) {
			System.out.println("0");			
		}
		else {
			System.out.println("양수");			
		}
		System.out.println();

//		### 10. `switch`문을 사용한 계절 출력
//		사용자로부터 월(1~12)을 입력받아, 해당 월이 속한 계절을 출력하는 프로그램을 작성하세요.
//		- 12, 1, 2: 겨울
//		- 3, 4, 5: 봄
//		- 6, 7, 8: 여름
//		- 9, 10, 11: 가을
//		System.out.print("월 입력 > ");//		
		int month1 = 12;
		
		switch(month1) {
			case 3: case 4: case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9: case 10: case 11:
				System.out.println("가을");
				break;
			default :
				System.out.println("겨울");
		}
		System.out.println();
		
//		### 11. 삼항 연산자를 사용한 간단한 프로그램
//		두 수를 입력받아, 더 큰 수를 출력하는 프로그램을 작성하세요. (삼항 연산자를 사용할 것)
//		System.out.print("두 가지 숫자 입력 > ");		
//		int num1 = 60;
//		int num2 = 10;
//		int result = 0;
//		
//		if(result == 0) {
//			result = num1 > num2 ? num1 : num2;
//			System.out.println(result);		
//		}	
		
		//조건문 안씀
//		System.out.print("두 가지 숫자 입력 > ");		
		int number1 = 40;
		int number2 = 30;
		int result1 = 0;		
		
		result1 = number1 > number2 ? number1 : number2;
		System.out.println(result1);	
		System.out.println();
		
		
		
//		### 12. `if-else`와 `switch`를 조합한 프로그램
//		사용자가 선택한 메뉴(1: 커피, 2: 주스, 3: 물)에 따라 각각의 가격을 출력하고, 그 외 숫자가 들어오면 "잘못된 선택입니다"를 출력하는 프로그램을 작성하세요.
//		System.out.print("메뉴 선택 1: 커피, 2: 주스, 3: 물 > ");
		
		int menu = 3;
		int coffee = 2000;
		int juice = 3000;
		int water = 1000;
		
		switch(menu) {
			case 1:
				System.out.println("커피 : " + coffee + "원");
				break;
			case 2:
				System.out.println("주스 : " + juice + "원");
				break;
			case 3:
				System.out.println("물 : " + water + "원");
				break;
			default :
				System.out.println("잘못된 선택입니다");
		}
		System.out.println();
		// if 활용할 부분을 잘 모르겠음
		
//		### 13. `if-else`로 윤년 판별
//		연도를 입력받아 해당 연도가 윤년인지 아닌지 판별하는 프로그램을 작성하세요. (윤년: 4로 나누어지고 100으로 나누어지지 않거나, 400으로 나누어지는 해)
//		System.out.print("연도 입력 > ");//		
		int year = 2024;
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년이다");
		}
		else {
			System.out.println("윤년이 아니다");
		}
		System.out.println();
		
//		### 14. `switch`를 이용한 학년 구분
//		사용자로부터 학년을 입력받아, 해당 학년이 "1학년", "2학년", "3학년", "4학년"인지 출력하는 프로그램을 작성하세요. 그 외 숫자가 들어오면 "잘못된 학년"이라고 출력하세요.
//		System.out.print("학년 입력 > ");//		
		int grade = 1;
		
		switch(grade) {
			case 1:
				System.out.println("1학년");
				break;
			case 2:
				System.out.println("2학년");
				break;
			case 3:
				System.out.println("3학년");
				break;
			default :
				System.out.println("4학년");
		}
		System.out.println();
		
//		### 15. `if-else`로 숫자 범위 확인
//		사용자로부터 입력받은 숫자가 1~100 사이에 있는지 여부를 확인하여, 범위 안에 있으면 "유효한 숫자입니다"를 출력하고 그렇지 않으면 "유효하지 않은 숫자입니다"를 출력하는 프로그램을 작성하세요.
//		System.out.print("1~100사이의 숫자 입력 > ");		
		int num = 101;
		
		if(num >= 1 && num <= 100) {
			System.out.println("유효한 숫자입니다");
		}
		else {
			System.out.println("유효하지 않은 숫자입니다");			
		}
	}
}
