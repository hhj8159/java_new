package java_new;

import java.util.Scanner;

public class Chap02_EXER {
	public static void main(String[] args) {
		 //ex01
		 int year = 0;
		 int age = 14;
		 
		 System.out.println(year);
		 System.out.println(age);
		 
		 year = age + 2000;
		 age = age +1;
		 
		 System.out.println(year);
		 System.out.println(age);
		 System.out.println();
		 
		 //ex02
		 int x = 10, y = 20;
		 int tmp = 0;
		 
		 System.out.println("x:" + x + "y:" + y);
		 
		 tmp = x;
		 x = y;
		 y = tmp;
		 
		 System.out.println("x:" + x + "y:" + y);
		 System.out.println();
		 
		 //ex03		 
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
		System.out.println("" + (7 + 7));
		System.out.println();
		
		//ex04
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L; // 100000000000L
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;  // 8진수 10, 10진수로는 8
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10; // 2진수 10 10진수로는 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("bigNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		System.out.println();
		
		//ex05
		String url = "www.codechobo.com";
		
		float f1 = .10f;  // 0.10, 1.0e-1
		float f2 = 1e1f;  // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);  // 전체  14자리 중 소수점 10자리
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);  // 왼쪽정렬
		System.out.printf("[%.8s]%n", url);  // 왼쪽에서 8글자만 출력
		System.out.println();
		
		//ex06
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("두자리 정수를 하나 입력해주세요");
//		String input = scanner.nextLine();
//		int num = Integer.parseInt(input);
//		
//		System.out.println("입력내용 : " + input);
//		System.out.printf("num = %d%n", num);
//		System.out.println();
		
		//ex07
		char ch = 'A';  // char ch = 65;
		int code = (int)ch;  // ch에 저장된 값을 int타입으로 변환하여 저장한다
		
		System.out.printf("%c = %d(%#X)%n", ch, code, code);
		
		char hch = '가';  // char hch = 0xAC00;
		System.out.printf("%c = %d(%#X)%n", hch, (int)hch, (int)hch);
		System.out.println();
		
		//ex08
		System.out.println('\'');  // '''처럼 할 수 없다
		System.out.println("abc\t123\b456");  // \b에 의해 3이 지워진다
		System.out.println('\n');  // 개행(new line)문자 출겨하고 개행
		System.out.println("\"Hello\"");  // 큰따옴표를 출력하려면 이렇게 한다
		System.out.println("c:\\");
		System.out.println();
		
		//ex09
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1));
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1 = " + (int)++cMax);
		System.out.println();
		
		//ex10
		float f5 = 9.12345678901234567890f;
		float f6 = 1.2345678901234567890f;
		double d2 = 9.12345678901234567890d;
		
		System.out.printf("	123456789012345678901234%n");
		System.out.printf("f5 : %f%n", f5);  // 소수점 이하 6째자리까지 출력
		System.out.printf("f5 : %24.20f%n", f5);
		System.out.printf("f6 : %24.20f%n", f6);
		System.out.printf("d2 : %24.20f%n", d2);
		System.out.println();
		
		//ex11
		float f7 = 9.1234567f;
		int i = Float.floatToIntBits(f7);
		
		System.out.printf("%f%n", f7);
		System.out.printf("%X%n", i);  // 16진수로 출력
		System.out.println();
		
		//ex12
		double d3 = 85.4;
		int score = (int)d3;
		
		System.out.println("score = " + score);
		System.out.println("d3 = " + d3);
		System.out.println();
		
		//ex13
		int i2 = 10;
		byte b2 = (byte)i2;
		System.out.printf("[int -> byte] i2 = %d -> b2 = %d%n", i2, b2);

		i2 = 300;
		b2 = (byte)i2;
		System.out.printf("[int -> byte] i2 = %d -> b2 = %d%n", i2, b2);
	
		b2 = 10;
		i2 = (int)b2;
		System.out.printf("[int -> byte] b2 = %d -> i2 = %d%n", i2, b2);
		
		b2 = -2;
		i2 = (int)b2;
		System.out.printf("[int -> byte] b2 = %d -> i2 = %d%n", i2, b2);
		
		System.out.println("i = " + Integer.toBinaryString(i2));
		System.out.println();
		
		//ex14
		float f8 = 9.1234567f;
		double d4 = 9.1234567;
		double d5 = (double)f8;
		
		System.out.printf("f8 =  %20.18f\n", f8);
		System.out.printf("d4 =  %20.18f\n", d4);
		System.out.printf("d5 =  %20.18f\n", d5);
		System.out.println();
		
		//ex15
		int i3 = 91234567;  // 8자리의 10진수
		float f9 = (float)i3;  // int를 float로 형변환
		int i4 = (int)f9;  // float를 다시 int로 형변환
		
		double d6 = (double)i3;  // int를 double로 형변환
		int i5 = (int)d6;  // double을 다시 int로 형변환
		
		float f10 = 1.666f;
		int i6 = (int)f10;
		
		System.out.printf("i3 = %d\n", i3);
		System.out.printf("f9 = %f  i4%d\n", f9, i4);
		System.out.printf("d6 = %f  i5%d\n", d6, i5);
		System.out.printf("(int)%f = %d\n", f10, i6);
		System.out.println();
		
		
		
	}
}
