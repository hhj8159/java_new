package java_new;

import java.util.Scanner;

public class Chap03_EXER {
	public static void main(String[] args) {
		//ex01
		int i = 5;
		i++;	// i = i + 1과 같은 의미이다. ++i로 바꿔도 결과는 같다
		System.out.println(i);
		
		i = 5;	// 결과를 비교하기 위해 i값을 다시 5로 변경
		++i;
		System.out.println(i);
		System.out.println();
		
		//ex02
		int i1 = 5, j = 0;
		
		j = i1++;
		System.out.println("j = i1++; 실행후, i1 = " + i1 + " , j = " + j);
		
		i1 = 5;	// 결과를 비교하기 위해, i1와 j의 값을 다시 5와 0으로 변경  
		j = 0;
		
		j = ++i1;
		System.out.println("j = ++i1; 실행후, i1 = " + i1 + " , j = " + j);
		System.out.println();
		
		//ex03
		int i2 = 5, j2 = 5;
		System.out.println(i2++);
		System.out.println(++j2);
		System.out.println("i = " + i + ", j = " +j);
		System.out.println();
		
		//ex04
		int i3 = -10;
		i3 = +i3;
		System.out.println(i3);
		
		i3 = -10;
		i3 = -i3;;
		System.out.println(i3);
		System.out.println();
		
		//ex05
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		System.out.println();
		
		//ex06
		byte a1 = 10;
		byte b1 = 20;
//		byte c1 = a1 + b1;
		byte c1 = (byte)(a1 + b1);
		System.out.println(c1);
		System.out.println();
		
		//ex07
		byte a2 = 10;
		byte b2 = 30;
		byte c2 = (byte)(a2 * b2);
		System.out.println(c2);
		System.out.println();
		
		//ex08
		int a3 = 1_000_000;	// 1,000,000 1백만
		int b3 = 2_000_000;	// 2,000,000 2백만
		
		long c3 = a3 * b3;	// a3 * b3 = 2,000,000,000,000 ?
		
		System.out.println(c3);
		System.out.println();
		
		//ex09
		long a4 = 1_000_000 * 1_000_000;
		long b4 = 1_000_000 * 1_000_000L;
		
		System.out.println("a = " +a4);
		System.out.println("b = " +b4);
		System.out.println();
		
		//ex10
		int a5 = 1000000;
		
		int result1 = a5 * a5 / a5;	// 1000000 * 1000000 / 1000000
		int result2 = a5 / a5 * a5;	// 1000000 / 1000000 * 1000000
		
		System.out.printf("%d * %d / %d = %d%n", a5, a5, a5, result1);
		System.out.printf("%d / %d * %d = %d%n", a5, a5, a5, result2);
		System.out.println();
		
		//ex11
		char a6 = 'a';
		char d6 = 'd';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d%n", d6, a6, d6 - a6);	// 'd' - 'a' = 3
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);	
		System.out.printf("'%c' = %d%n", a6, (int)a6);
		System.out.printf("'%c' = %d%n", d6, (int)d6);
		System.out.printf("'%c' = %d%n", zero, (int)zero);
		System.out.printf("'%c' = %d%n", two, (int)two);
		System.out.println();
		
		//ex12
		char e1 = 'a';	// e1에는 문자 'a'의 코드값인 97이 저장된다
		char e2 = e1;	// e1에 저장되어 있는 값이 e2에 저장된다
		char e3 = ' ';	// e3를 공백으로 초기화 한다
		
		int i4 = e1 + 1;	// 'a' + 1 -> 97 + 1 -> 98
		
		e3 = (char)(e1 + 1);
		e2++;
		e2++;
		
		System.out.println("i4 = " + i4);
		System.out.println("e2 = " + e2);
		System.out.println("e3 = " + e3);
		System.out.println();
		
		//ex13
		char r1 = 'a';
		
//		char r2 = r1 + 1;		// 라인 5 : 컴파일에러
		char r2 = 'a' + 1;	// 라인 6 : 컴파일에러없음
		
		System.out.println(r2);
		System.out.println();
		
		//ex14
		char c4 = 'a';
		for(int i5 = 0 ; i5 < 26 ; i5++) {	// 블럭{} 안의 문장을 26번을 반복한다
			System.out.println(c4++);		// 'a'부터 26개의 문자를 출력한다
		}
		System.out.println();	// 줄바꿈을 한다
		
		c4 = 'A';
		for(int i5 = 0 ; i5 < 26 ; i5++) {	// 블럭{} 안의 문장을 26번을 반복한다
			System.out.println(c4++);		// 'A'부터 26개의 문자를 출력한다
		}
		System.out.println();
		
		c4 = '0';
		for(int i5 = 0 ; i5 < 10 ; i5++) {	// 블럭{} 안의 문장을 10번을 반복한다
			System.out.println(c4++);		// '0'부터 10개의 문자를 출력한다
		}
		System.out.println();
		
		//ex15
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);
		System.out.println(upperCase);
		System.out.println();
		
		//ex16
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		System.out.println(shortPi);
		System.out.println();
		
		//ex17
		double pi1 = 3.141592;
		double shortPi1 = (int)(pi1 * 1000 + 0.5) / 1000.0;
		
		System.out.println(shortPi1);
		System.out.println();
		
		//ex18
		double pi2 = 3.141592;
		double shortPi2 = Math.round(pi2 * 1000) / 1000.0;
		System.out.println(shortPi2);
		System.out.println();
		
		//ex19
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다. %n", x / y, x % y);
		System.out.println();
		
		//ex20
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
		System.out.println();
		
		//ex21
		System.out.printf("10 == 10.0f	 \t %b%n", 10 == 10.0f);
		System.out.printf("'0' == 0	 \t %b%n", '0' == 0);
		System.out.printf("'A' == 65	 \t %b%n", 'A' == 65);
		System.out.printf("'A' > 'B'	 \t %b%n", 'A' > 'B');
		System.out.printf("'A' + 1 != 'B'	 \t %b%n", 'A' + 1 != 'B');
		System.out.println();
		
		//ex22
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0 == 10.0f %b%n", 10.0 == 10.0f);
		System.out.printf("0.1 == 0.1f %b%n", 0.1 == 0.1f);
		System.out.printf("f =% 19.17f%n", f);
		System.out.printf("d =% 19.17f%n", d);
		System.out.printf("d2 =% 19.17f%n", d2);
		System.out.printf("d == f %b%n", d == f);
		System.out.printf("d == d2 %b%n", d == d2);
		System.out.printf("d2 == f %b%n", d2 == f);
		System.out.printf("(float)d == f %b%n", (float)d == f);
		System.out.println();
		
		//ex23
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
		System.out.printf("str1 == \"abc\" ? %b%n", str1 == "abc");
		System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equals("ABC")); // 문자열 비교시 대소문자 구별하지 않고 하려면 equalsIgnoreCase() 사용
		System.out.println();
		
		//ex24
		int x1 = 0;
		char ch = ' ';
		
		x1 = 15;
		System.out.printf("x1 = %2d, 10 < x1 && x1 < 20 = %b%n", x1, 10 < x1 && x1 < 20);

		x1 = 6;
		System.out.printf("x = %2d, x%%2 == 0 || x%%3 == 0 && x%%6 != 0 = %b%n", x1, x1 % 2 == 0 || x1 % 3 == 0 && x1 % 6 != 0);
		System.out.printf("x = %2d, x%%2 == 0 || x%%3 == 0 && x%%6 != 0 = %b%n", x1, (x1 % 2 == 0 || x1 % 3 == 0) && x1 % 6 != 0);
		
		ch = '1';
		System.out.printf("ch = '%c', '0' <= ch && ch <= '9' = %b%n", ch, '0' <= ch && ch <= '9');
		
		ch = 'a';
		System.out.printf("ch = '%c', 'a' <= ch && ch <= 'z' = %b%n", ch, 'a' <= ch && ch <= 'z');
		
		ch = 'A';
		System.out.printf("ch = '%c', 'A' <= ch && ch <= 'Z' = %b%n", ch, 'A' <= ch && ch <= 'Z');
		
		ch = 'q';
		System.out.printf("ch = '%c', ch == 'q' || ch == 'Q' = %b%n", ch, ch == 'q' || ch == 'Q');
		System.out.println();
		
		//ex25
		Scanner scanner = new Scanner(System.in);
		char ch1 = ' ';
		
		System.out.printf("문자를 하나 입력하세요. > \n");
		
//		String input = scanner.nextLine();
//		ch1 = input.charAt(0);
		
		if('0' <= ch1 && ch1 <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다. %n");
		}
		
		if(('a' <= ch1 && ch1 <= 'z') || ('A' <= ch1 && ch1 <= 'Z')){
			System.out.printf("입력하신 문자는 영문자입니다. %n");
		}
		
		//ex26
		int a7 = 5;
		int b7 = 0;
		
		System.out.printf("a7 = %d, b7 = %d%n", a7, b7);
		System.out.printf("a7 != 0 || ++b7 != 0 = %b%n", a7 != 0 || ++b7 != 0);
		System.out.printf("a7 = %d, b7 = %d%n", a7, b7);
		System.out.printf("a7 == 0 && ++b7 != 0 = %b%n", a7 == 0 && ++b7 != 0);
		System.out.printf("a7 = %d, b7 = %d%n", a7, b7);
		System.out.println();
		
		//ex27
		boolean bl = true;
		char ch2 = 'C';
		
		System.out.printf("b = %b%n", bl);
		System.out.printf("!b = %b%n", !bl);
		System.out.printf("!!b = %b%n", !!bl);
		System.out.printf("!!!b = %b%n", !!!bl);
		System.out.println();
		
		System.out.printf("ch2 = %c%n", ch2);
		System.out.printf("ch2 < 'a' || ch2 > 'z' = %b%n", ch2 < 'a' || ch2 > 'z');
		System.out.printf("!(ch2 <= 'a' && ch2 <= 'z') = %b%n", !(ch2 <= 'a' && ch2 <= 'z'));
		System.out.printf("'a' <= ch2 && ch2 <= 'z' = %b%n", 'a' <= ch2 && ch2 <= 'z');
		System.out.println();
		
		//ex28
		int x2 = 0xAB, y2 = 0xF;
		
		System.out.printf("x2 = %#X \t\t%s%n", x2, toBinaryString(x2));
		System.out.printf("y2 = %#X \t\t%s%n", y2, toBinaryString(y2));
		System.out.printf("%#X | %#X = %#X \t%s%n", x2, y2, x2 | y2, toBinaryString(x2 | y2));
		System.out.printf("%#X & %#X = %#X \t%s%n", x2, y2, x2 & y2, toBinaryString(x2 & y2));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x2, y2, x2 ^ y2, toBinaryString(x2 ^ y2));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x2, y2, y2, x2 ^ y2 ^ y2, toBinaryString(x2 ^ y2 ^ y2));
		System.out.println();
		
		//ex29
		byte p = 10;
		byte n = -10;
		
		System.out.printf("p = %d \t%s%n", p, toBinaryString(p));
		System.out.printf("~p = %d \t%s%n", ~p, toBinaryString(~p));
		System.out.printf("~p + 1 = %d \t%s%n", ~p + 1,	toBinaryString(~p + 1));
		System.out.printf("~p = %d \t%s%n", ~~p, toBinaryString(~~p));
		System.out.println();
		System.out.printf("n = %d%n", n);
		System.out.printf("~(n - 1) = %d%n", ~(n - 1));
		System.out.println();
		
		//ex30
		int dec = 8;
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();
		
		dec = -8;
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();
		
		dec = 8;
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32));
		System.out.println();
		
		//ex31
		int dec1 = 1234;
		int hex = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex = %X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		System.out.println();
		
		//ex32
		int x3, y3, z3;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x3 = 10;
		y3 = -5;
		z3 = 0;
		
		absX = x3 >= 0 ? x3 : -x3;
		absY = y3 >= 0 ? y3 : -y3;
		absZ = z3 >= 0 ? z3 : -z3;
		
		signX = x3 > 0 ? '+' : (x3 == 0 ? ' ' : '-');	// 조건 연산자를 중첩
		signY = y3 > 0 ? '+' : (y3 == 0 ? ' ' : '-');
		signZ = z3 > 0 ? '+' : (z3 == 0 ? ' ' : '-');
		
		System.out.printf("x3 = %c%d%n", signX, absX);
		System.out.printf("y3 = %c%d%n", signY, absY);
		System.out.printf("z3 = %c%d%n", signZ, absZ);
		
	}
	static String toBinaryString(int x) {	// 10진 정수를 2진수로 변환하는 메서드
		String zero = "0000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
}
