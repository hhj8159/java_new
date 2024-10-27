package oop;

import java.util.Arrays;

public class ClassEXER {
	public static void main(String[] args) {
		// 클래스 : 인스턴스를 만들기위한 설계도
		// 변수, 메서드
		// 변수의 종류
		// 1. 클래스 변수
		// 2. 인스턴스 변수
		// 3. 지역변수(매개변수)
		
		int[] hour = {3, 4, 5};
		int[] minute = {11, 22, 33};
		float[] second = {33, 44, 55};
		
		// 시 분 초
		System.out.println(hour[0] + ", " + minute[0] + ", " + second[0]);
		
		
		
		Time t1 = new Time(); // Time타입 {변수 hour 0 minute 0 second 0.0f}
//		t1.hour = 3; // 값 변경
		t1.setHour(10); // ex) -3이라면 제약조건에 걸려서 0출력
		t1.minute = 11;
		t1.second = 33.333f;
		
		System.out.println(t1);
		System.out.println(t1.getHour());
		
		
		Time[] times = new Time[3]; // {null, null, null}
		times[0] = t1;
		times[1] = new Time();
		times[2] = new Time();
		
		System.out.println(Arrays.toString(times));
		
		
		
// 		DB 제약조건
//		유일성 보장 : unique
//		빈값없음 : not null
//		범위 : check
		
//		나머지연산 = 11 / 4
//		몫 : 2
//		제수(나누는수) : 4
//		피제수(나눠지는수) : 11
//		나머지 : 3
//		몫 * 제수 + 나머지 = 피제수
		
//		가감승제
//		제곱, 제곱근
//		2의 3제곱 = 2의 3승 = 2^3  >>  8 = 2 * 2 * 2
//		2^5 = 32
//		3^3 = 27

//		3^2 = 9
//		9를 만들기 위해 필요한 숫자와 2제곱 
		
//		피타고라스 법칙
//		직각 삼각형 
		
//		두 점 사이의 거리 구하기
//		(1, 3) (5, 8)
//		5-1=4
//		8-3=5
//		4*4 + 5*5
//		41
//		square 제곱 root 근
		System.out.println(Math.sqrt(41));
		
		long value = 'A'; // 1. 문자로 숫자다. 2. 자동 형변환
		System.out.println(value);
		
		Time time = new Time();
		t1.setHour(10); // 10 >> 인자, 인수 argument 
		int v = (int)value;
		Time.sm();
		
		
	}
}
// 구조체의 목적
class Structure {
	int no;
	String name;
}

class Time {
	static void sm() {
		
	}
	
	private int hour;
	// 필드에 접근하는 방법을 제공
	// 지정 set
	// 조회 get
	public void setHour(int h) { // h : parameter 매개변수
		// 드 모르간의 법칙
		
		// 0이상이면서 24미만
		// 0미만이거나 24이상이 아닐 때
//		if(!(h < 0 && h >= 24)) {
//			hour = h;			
//		}
		if(h < 0 || h > 23) {
			return; // 반환, 되돌림, 호출한 쪽으로 되돌림
		}
		hour = h;
	}
	public int getHour() {
		int i = 10;
		return hour;
	}
	
	// 다수의값을 반환하려면 배열
	public int[] get() {	
		int i = 10;
		return new int[] {1, 2, 3, 4};
	}
	
	int minute;
	float second;
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	
}