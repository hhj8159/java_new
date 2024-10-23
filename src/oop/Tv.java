package oop;

public class Tv {
//	String student;
//	int kor;
//	int eng;
//	int mat;
//	
//	int sum;
//	int avg;
//	
//	void setKor(int k) {
//		kor = k;
//	}
//	void setEng(int e) {
//		eng = e;
//	}
//	void setMat(int m) {
//		mat = m;
//	}
//	
//	void setSum() {
//		sum = kor + eng + mat;
//	}
//
//	void setAvg() {
//		avg = (kor + eng + mat) / 3;
//		
//	}
	
	boolean power;
	int volume;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void volumeUp(int v) {
		v = 10;
		volume += v;
	}
	void volumeDown(int v) {
		v = 10;
		volume -= v;
	}
	
	void channelUp(int c) {
		channel++;
	}
	
	void channelDown(int c) {
		channel--;
	}
	
	void setChannel(int c) {
		channel = c;
	}
	
}
