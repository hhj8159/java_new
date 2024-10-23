package java_new;

public class StudentMain {
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setName("우주");
		student.setKor(97);
		student.setEng(85);
		student.setMat(100);
		
		int sum = student.getTotal();
		float avg = student.getAvg();
		
		System.out.printf("학생 %s 국어 %d 영어 %d 수학 %d 총점 %d 평균 %.2f", student.name, student.kor, student.eng, student.mat, sum, avg);
		
//		System.out.println(student.name.equals("우주")); 
	
	}
}
