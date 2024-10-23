package oop;

public class TvMain {
	public static void main(String[] args) {

		
		Tv tv = new Tv();
		
		tv.power();
		tv.power();
		tv.power();
		tv.volumeUp(0);
		tv.volumeUp(0);
		tv.volumeDown(0);
		tv.channelUp(0);
		tv.channelUp(0);
		tv.channelUp(0);
		tv.channelDown(0);
		tv.setChannel(60);
		
		
		
//		System.out.printf("%s" + tv.power);
		System.out.println(tv.power);
		System.out.println(tv.volume);
		System.out.println(tv.channel);
		System.out.printf("tv 전원%s 볼륨%d 채널%d", tv.power, tv.volume, tv.channel);
		
		
		
	}
}
