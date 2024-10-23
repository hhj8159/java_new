package java_new;

public class Student {

	String name;
	int kor;
	int eng;
	int mat;
	
	void setName(String n) {
//		if(n.matches("^[가-힣]+$")) {
			name = n;
//		}
//		else {
//			System.out.println("한글 이름을 입력해주세요.");
//		}
	}

	void setKor(int k) {
		if(k >= 0 && k <= 100) {
			kor = k;			
		}
		else {
			System.out.println("1~100사이의 숫자를 입력하세요.");
		}
	}
	
	void setEng(int e) {
		eng = e;
	}
	
	void setMat(int m) {
		mat = m;
	}
	
	int getTotal() {
		return kor + eng + mat;
	}
	
	float getAvg() {
		return getTotal() / 3.0f;
	}
	
}
