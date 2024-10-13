package java_new;

import java.util.Scanner;

public class Chap04_EXER {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//ex01
		int x = 0;
		System.out.printf("x = %d 일 때, 참인 것은%n", x);
		
		if(x == 0) System.out.println("x == 0");
		if(x != 0) System.out.println("x != 0");
		if(!(x == 0)) System.out.println("!(x == 0)");
		if(!(x != 0)) System.out.println("!(x != 0)");
		
		x = 1;
		System.out.printf("x = %d 일 때, 참인 것은%n", x);
		
		if(x == 0) System.out.println("x == 0");
		if(x != 0) System.out.println("x != 0");
		if(!(x == 0)) System.out.println("!(x == 0)");
		if(!(x != 0)) System.out.println("!(x != 0)");
		System.out.println();
		
//		//ex02
//		int input;
//		
//		System.out.println("\n숫자를 하나 입력하세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();	// 화면을 통해 입력받은 내용을 tmp에 저장
//		input = Integer.parseInt(tmp);		// 입력받은 문자열(tmp)을 숫자로 변환
//		
//		if(input == 0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//		}
//		
//		if(input != 0) {
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//			System.out.printf("입력하신 숫자는 %d입니다", input);
//		} // main
//		System.out.println();
//		
//		//ex03
//		System.out.print("숫자를 하나 입력하세요.>");
//		Scanner scanner1 = new Scanner(System.in);
//		int input1 = scanner1.nextInt();	// 화면을 통해 입력받은 숫자를 input에 저장
//		
//		if(input1 == 0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//		}
//		else { // input != 0인 경우
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//		} // main의 끝
//		System.out.println();
//		
//		//ex04
//		int score = 0;	// 점수를 저장하기 위한 변수
//		char grade = ' ';	// 학점을 저장하기 위한 변수. 공백으로 초기화한다.
//		
//		System.out.print("점수를 입력하세요.>");
//		Scanner scanner2 = new Scanner(System.in);
//		score = scanner2.nextInt();	// 화면을 통해 입력받은 숫자를  score에 저장
//		
//		if (score >= 90) {	// score가 90점 보다 같거나 크면 A학점
//			grade = 'A';
//		}
//		else if (score >= 80) {	// score가 80점 보다 같거나 크면 B학점
//			grade = 'B';
//		}
//		else if (score >= 70) {	// score가 70점 보다 같거나 크면 C학점
//			grade = 'C';
//		}
//		else {					// 나머지는 D학점
//			grade = 'D';
//		}
//		System.out.println("당신의 학점은 " + grade + "입니다.");
//		System.out.println();
//		
//		//ex05
//		int score1 = 0;
//		char grade = ' ', opt = '0';
//		
//		System.out.print("점수를 입력해주세요.>");
//		
//		Scanner scanner3 = new Scanner(System.in);
//		score1 = scanner3.nextInt();	// 화면을 통해 입력받은 점수를 score1에 저장
//		
//		System.out.printf("당신의 점수는 %d입니다.%n", score1);
//		
//		if (score1 >= 90) {			// score1가 90점 보다 같거나 그면 A학점(grade)
//			grade = 'A';
//			if (score1 >= 98) {		// 90점 이상 중에서도 98점 이상은 A+
//				opt = '+';
//			}
//			else if (score1 < 94) {	// 90점 이상 94점 미만은 A-
//				opt = '-';
//			}
//		}
//		else if (score1 >= 80) {	// score1가 80점 보다 같거나 크면 B학점(grade)
//			grade = 'B';
//			if (score1 >= 88) {
//				opt = '+';
//			}
//			else if (score1 < 84) {
//				opt = '-';
//			}
//		}
//		else {						// 나머지는 C학점(grade)
//			grade = 'C';
//		}
//		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
//		System.out.println();
//		
//		//ex06
//		System.out.print("현재 월을 입력하세요.>");
//		
//		Scanner scanner4 = new Scanner(System.in);
//		int month = scanner4.nextInt();			// 화면을 통해 입력받은 숫자를 month에 저장
//		
//		switch(month) {
//			case 3:
//			case 4:
//			case 5:
//				System.out.println("현재의 계절은 봄입니다.");
//				break;
//			case 6: case 7: case 8:
//				System.out.println("현재의 계절은 여름입니다.");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("현재의 계절은 가을입니다.");
//				break;
//			default :
////			case 12:	case 1: case 2:
//				System.out.println("현재의 계절은 겨울입니다.");
//		}// main의 끝
//		System.out.println();
//		
//		//ex07
//		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
//		
//		Scanner scanner5 = new Scanner(System.in);
//		int user = scanner5.nextInt();				// 화면을 통해 입력받은 숫자를 user에 저장
//		int com = (int)(Math.random() * 3) + 1;		// 1, 2, 3 중 하나가 com에 저장됨
//		
//		System.out.println("당신은 " + user + "입니다.");
//		System.out.println("컴은 " + com + "입니다.");
//		
//		switch(user - com) {
//		case 2: case -1:
//			System.out.println("당신이 졌습니다.");
//			break;
//		case 1: case -2:
//			System.out.println("당신이 이겼습니다.");
//			break;
//		case 0:
//			System.out.println("비겼습니다.");
////			break;									// 마지막 문장이므로 break를 사용할 필요가 없다.
//		} // main의 끝
//		
//		//ex08
//		System.out.print("당신의 주민번호를 입력하세요. (011231-1111222)>");
//		
//		Scanner scanner6 = new Scanner(System.in);
//		String regNo = scanner6.nextLine();
//		
//		char gender = regNo.charAt(7);		// 입력받은 번호의 8번째 문자를 gender에 저장
//		
//		switch(gender) {
//			case '1': case '3':
//				System.out.println("당신은 남자입니다.");
//				break;
//			case '2': case '4':
//				System.out.println("당신은 여자입니다.");
//				break;
//			default :
//				System.out.println("유효하지 않은 주민등록번호입니다.");
//		} // main의 끝
//		
//		//ex09
//		char grade = ' ';
//		
//		System.out.print("당신의 점수를 입력하세요. (1~100)>");
//		
//		Scanner scanner7 = new Scanner(System.in);
//		int score2 = scanner7.nextInt();		// 화면을 통해 입력받은 숫자를 score에 저장
//		
//		switch(score2) {
//			case 100: case 99: case 98: case 97: case 96:
//			case 95: case 94: case 93: case 92: case 91: case 90:
//				grade = 'A';
//				break;
//			case 89: case 88: case 87: case 86: case 85:
//			case 84: case 83: case 82: case 81: case 80:
//				grade = 'B';
//				break;
//			case 79: case 78: case 77: case 76: case 75:
//			case 74: case 73: case 72: case 71: case 70:
//				grade = 'C';
//				break;
//			default :
//				grade = 'F';
//		} // end of switch
//		System.out.println("당신의 학점은 " + grade + "입니다.");
//		
//		//ex10
//		int score = 0;
//		char grade = ' ';
//		
//		System.out.print("당신의 점수를 입력하세요. (1~100)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();		// 화면을 통해 입력받은 내용을 tmp에 저장
//		score = Integer.parseInt(tmp);			// 입력받은 문자열(tmp)를 숫자로 변환
//		
//		switch (score / 10) {
//			case 10: 
//			case 9 :
//				grade = 'A';
//				break;
//			case 8 :
//				grade = 'B';
//				break;
//			case 7 :
//				grade = 'C';
//				break;
//			default :
//				grade = 'F';
//		} // end of switch
//		System.out.println("당신의 학점은 " + grade + "입니다.");
//		
		//ex11
//		System.out.print("당신의 주민번호를 입력하세요. (011231-1111222)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String regNo = scanner.nextLine();
//		char gender = regNo.charAt(7);		// 입력받은 번호의 8번째 문자를 gender에 저장
//		
//		switch(gender) {
//			case '1': case '3':
//				switch (gender) {
//					case '1':
//						System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
//						break;
//					case '3':
//						System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
//				}
//				break;
//			case '2': case '4':
//				switch(gender) {
//					case '2':
//						System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
//						break;
//					case '4':
//						System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
//						break;
//				}
//				break;
//			default :
//				System.out.println("유효하지 않은 주민등록번호입니다.");
//		}
		
		//ex12
		for(int i = 1; i <= 5; i++) 
			System.out.println(i);	// i의 값을 출력한다.
		
		for(int i = 1; i <= 5; i++)
			System.out.print(i);	// print()를 쓰면 가로로 출력된다.
		
		System.out.println();
		System.out.println();
		
		//ex13
		int sum = 0;	// 합계를 저장하기 위한 변수.
		
		for(int i = 1; i <= 10; i++) {
			sum += i;	// sum = sum + i;
			System.out.printf("1부터 %2d까지의 합 : %2d%n", i, sum);
		}
		System.out.println();
		
		//ex14
		for(int i = 1, j = 10; i <= 10; i++, j--)
			System.out.printf("%d \t %d%n", i, j);
		System.out.println();
		
		//ex15
		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("----------------------------------------------");
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
		}
		System.out.println();
		
		//ex16
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//ex17
		int num = 0;
		
		System.out.print("*을 출력할 라인의 수를 입력하세요. >");
		
//		String tmp = scanner.nextLine(); //	화면을 통해 입력받은 내용을 tmp에 저장
//		num = Integer.parseInt(tmp);	 // 입력받은 문자열(tmp)을 숫자로 변환
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//ex18
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", i, j, i * j);				
			}
			System.out.println();
		}
		System.out.println();
		
		//ex19
		for(int i = 1; i <= 3 ; i++) {
			for(int j = 1; j <= 3; j++) {
				for(int k = 1; k <= 3; k++) {
					System.out.println("" + i + j + k);
				}
			}
		}
		System.out.println();
		
		//ex20
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.printf("[%d,%d]", i, j);				
			}
			System.out.println();
		}
		System.out.println();
		
		//ex21
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == j) {
					System.out.printf("[%d,%d]", i, j);	
//					System.out.println("*");
				}
				else {
					System.out.printf("%5c", ' ');
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//ex22
		int[] arr = {10, 20, 30, 40, 50};
		int sum1 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum1 += tmp;
		}
		System.out.println();
		System.out.println("sum = " + sum1);
		System.out.println();
		
		//ex23
		int i = 5;
		
		while(i-- != 0) {
			System.out.println(i + " - I can do it.");
		}
		System.out.println();
		
		//ex24
//		int i1 = 11;
//		
//		System.out.println("카운트 다운을 시작합니다.");
//		
//		while(i1-- != 0) {
//			System.out.println(i1);
//			
//			for(int j1 = 0; j1 < 1_000_000_000; j1++) {
//				
//			}
//		}
//		System.out.println("GAME OVER");
//		System.out.println();
		
		//ex25
		int num2 = 0, sum2 = 0;
		System.out.print("숫자를 입력하세요.(예:12345) >");
		
//		String tmp = scanner.nextLine();	// 화면을 통해 입력받은 내용을 tmp에 저장
//		num2 = Integer.parseInt(tmp);		// 입력받은 문자열(tmp)를 숫자로 변환		
		
		while(num != 0)	{
			// num을 10으로 나눈 나머지를 sum에 더함
			sum2 += num2%10;
			System.out.printf("sum2 = %3d num2 = %d%n", sum2, num2);
			
			num2 /= 10;						// num2 = num2 / 10;  num2를 10으로 나눈 값을 다시  num2에 저장
		}
		System.out.println("각 자리수의 합 : " + sum);
		System.out.println();
		
		//ex26
		int sum3 = 0;
		int i3 = 0;
		
		//i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while((sum3 += ++i3) <= 100) {
			System.out.printf("%d - %d%n", i3, sum3);
		}
		System.out.println();
		
		//ex27
		int num4;
		int sum4 = 0;
		boolean flag = true;	// while문의 조건식으로 사용될 변수
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		
//		while(flag) {
//			System.out.print(">>");
//			
//			String tmp = scanner.nextLine();
//			num4 = Integer.parseInt(tmp);
//			
//			if(num4 != 0) {
//				sum4 += num4;	// num4가 0이 아니면, sum4에 더한
//			}
//			else {
//				flag = false; // num4가 0이면, flag의 값을 false로 변경
//			}
//		} // while문의 끝
		System.out.println("합계 : " + sum4);
		System.out.println();
		
		//ex28
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1~100사이의 임의의 수를 저장
		
//		do {
//			System.out.print("1과 100사이의 정수를 입력하세요. >");
//			input = scanner.nextInt();
//			
//			if(input > answer) {
//				System.out.println("더 작은 수로 다시 시도해보세요.");
//			}
//			else if(input < answer) {
//				System.out.println("더 큰 수로 다시 시도해보세요.");				
//			}
//		}
//		while(input != answer);
		
		System.out.println("정답입니다.");
		System.out.println();
		
		//ex29
		for(int a = 1; a <= 100; a++) {
			System.out.printf("i = %d ", a);
			
			int tmp = a;
			do {
				//tmp%10이 3의 배수인지 확인(0제외)
				if(tmp % 10 % 3 == 0 && tmp % 10 != 0) {
					System.out.print("짝");
				}
				//	tmp /= 10은 tmp = tmp / 10과 동일
			}
			while ((tmp /= 10) != 0);
			System.out.println();
		}
		System.out.println();
		
		//ex30
		int sum5 = 0;
		int i5 = 0;
		
		while(true) {
			if(sum5 > 100) {
				break;
			}
			++i5;
			sum5 += i5;
		} // end of while
		System.out.println("i5 = " + i5);
		System.out.println("sum5 = " + sum5);
		System.out.println();
		
		//ex31
		for(int i4 = 0; i4 <= 10; i4++) {
			if(i4 % 3 == 0) {
				continue;
			}
			System.out.println(i4);
		}
		System.out.println();
		
		//ex32
		int menu = 0;
		int number = 0;
		
//		while(true) {
//			System.out.println("(1) square");
//			System.out.println("(2) square root");
//			System.out.println("(3) log");
//			System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료 : 0)> ");
//			
//			String tmp = scanner.nextLine();	// 화면에서 입력받은 내용을 tmp에 저장
//			menu = Integer.parseInt(tmp);		// 입력받은 문자열(tmp)을 숫자로 변환
//			
//			if(menu == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			else if(!(1 <= menu && menu <= 3)) {
//				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
//				continue;
//			}
//			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
//		}
		System.out.println();
		
		//ex33
		// for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i6 = 2; i6 <= 9; i6++) {
			for(int j6 = 1; j6 <= 9; j6++) {
				if(j6 == 5) {
					break Loop1;
//					break;
//					continue Loop1;
//					continue;
				}
				System.out.println(i6 + "*" + j6 + "=" + i6 * j6);
			}	//end of for i6
			System.out.println();
		}	//end of Loop1
		System.out.println();
		
		//ex34
		int menu1 = 0, number1 = 0;
		
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료 : 0)> ");
			
			String tmp = scanner.nextLine();	// 화면에서 입력받은 내용을 tmp에 저장
			menu1 = Integer.parseInt(tmp);		// 입력받은 문자열(tmp)을 숫자로 변환
			
			if(menu1 == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(!(1 <= menu1 && menu1 <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
			
			for(;;) {
				System.out.print("계산할 값을 입력하세요. (계산 종료 : 0, 전체 종료 : 99) > ");
				tmp = scanner.nextLine();		// 화면에서 입력받은 내용을 tmp에 저장
				number1 = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
				
				if(number1 == 0) {
					break;			// 계산 종료. for문을 벗어난다.
				}
				if(number1 == 99) {
					break outer;			// 전체 종료. for문과 while문 모두 벗어난다.					
				}
				switch(menu1) {
					case 1:
						System.out.println("result = " + number1 * number1);
						break;
					case 2:
						System.out.println("result = " + Math.sqrt(number1));
						break;
					case 3:
						System.out.println("result = " + Math.log(number1));
						break;
				}
			}// for문의 끝
		}// while문의 끝
		
	}	
}
