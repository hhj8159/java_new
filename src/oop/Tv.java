package oop;

public class Tv {
	
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
