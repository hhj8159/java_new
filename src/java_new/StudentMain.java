package java_new;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		int kor = Integer.parseInt(scanner.nextLine());
		int eng = Integer.parseInt(scanner.nextLine());
		int mat = Integer.parseInt(scanner.nextLine());
		
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMat(mat);
//		student.setName("우주");
//		student.setKor(97);
//		student.setEng(85);
//		student.setMat(100);
		
		int sum = student.getTotal();
		float avg = student.getAvg();
		
		System.out.printf("학생 %s 국어 %d 영어 %d 수학 %d 총점 %d 평균 %.2f", student.name, student.kor, student.eng, student.mat, sum, avg);
		
//		System.out.println(student.name.equals("우주")); 
	
	}
}
