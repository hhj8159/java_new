package oop;

public class TvMain {
	public static void main(String[] args) {
//		Student student = new Student();
//		
//		student.setKor(80);
//		student.setEng(80);
//		student.setMat(80);
//		System.out.printf("kor: %d eng: %d mat: %d\n", student.kor , student.eng, student.mat);
//		System.err.println(student.sum);
//		System.err.println(student.avg);
		
		Tv tv = new Tv();
		
		tv.power();
		tv.power();
		tv.power();
//		tv.volumeUp(0);
//		tv.volumeUp(0);
//		tv.volumeDown(0);
		tv.channelUp(0);
		tv.channelUp(0);
		tv.channelUp(0);
		tv.channelDown(0);
		tv.setChannel(60);
		
		for(int i = 0; i <= 4; i++) {
			tv.volumeUp(0);
		}
		for(int i = 0; i <= 4; i++) {
			tv.power();
		}
		
		
//		System.out.printf("%s" + tv.power);
		System.out.println(tv.power);
		System.out.println(tv.volume);
		System.out.println(tv.channel);
		System.out.printf("tv 전원%s 볼륨%d 채널%d", tv.power, tv.volume, tv.channel);
		
		
		
	}
}
