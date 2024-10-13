package java_new;

import java.text.DateFormat;
import java.time.chrono.ThaiBuddhistChronology;

public class Chap03_EXER2 {
	public static void main(String[] args) {
//		문제 1: 과일 상자 문제
//		과일이 123개 있고, 한 상자에 과일을 10개씩 담을 수 있다. 남은 과일 없이 상자에 모두 담으려면 최소 몇 개의 상자가 필요할까?		
		int fruits = 123;
		int boxCapacity = 10;
		int remainFruits = fruits % boxCapacity == 0 ? 0 : 1;
		// 필요한 상자 수를 구하는 코드를 작성하세요.
		System.out.println(fruits / boxCapacity + remainFruits);
		System.out.println();
		
//		문제 2: 커피 가게 문제
//		커피 한 잔의 가격은 4,500원이다. 15잔을 구매하면 총 얼마를 지불해야 하는가?		
		int pricePerCup = 4500;
		int numberOfCups = 15;
		// 총 지불 금액을 구하는 코드를 작성하세요.
		System.out.println(pricePerCup * numberOfCups);
		System.out.println();
		
//		문제 3: 피자 나누기 문제
//		피자가 총 8조각이다. 친구 5명과 함께 나눠 먹으려고 한다. 각 사람이 먹을 수 있는 피자의 조각 수는?
		int pizzaSlices = 8;
		int numberOfFriends = 5;
		// 각 사람이 먹을 수 있는 피자 조각 수를 구하는 코드를 작성하세요.
		System.out.println(pizzaSlices / numberOfFriends);
		System.out.println();
		
//		문제 4: 지출 관리 문제
//		한 달 용돈이 30만 원이다. 한 달 동안 3만 원씩 5번 지출했다면, 남은 용돈은 얼마인가?
		int allowance = 300000;
		int spent = 30000 * 5;
		// 남은 용돈을 구하는 코드를 작성하세요.
		System.out.println(allowance - spent);
		System.out.println();
		
//		문제 5: 버스 요금 문제
//		버스 요금이 1,200원이다. 20회 탑승했다면, 총 지불한 금액은 얼마인가?
		int busFare = 1200;
		int rides = 20;
		// 총 지불 금액을 구하는 코드를 작성하세요.
		System.out.println(busFare * rides);
		System.out.println();

//		문제 6: 시험 점수 문제
//		학생의 5과목 점수가 각각 78, 85, 90, 94, 88점이다. 평균 점수를 구해보자.
		int korean = 78;
		int math = 85;
		int english = 90;
		int science = 94;
		int history = 88;
		// 평균 점수를 구하는 코드를 작성하세요.
		System.out.println((korean + math + english + science + history) / 5);
		System.out.println();
		
//		문제 7: 영화 관람객 수 문제
//		극장에 총 120명이 앉을 수 있다. 15명의 단체 6팀이 영화를 보러 왔다. 좌석이 전부 찼는지 여부를 확인하시오.
		int totalSeats = 120;
		int groupSize = 15;
		int numberOfGroups = 6;
		// 좌석이 모두 찼는지 여부를 구하는 코드를 작성하세요.
		System.out.println(0 >= totalSeats - groupSize * numberOfGroups);
		System.out.println();
		
//		문제 8: 책장 채우기 문제
//		책이 245권 있다. 한 책장에 30권씩 넣을 수 있다면, 필요한 책장의 최소 개수는?
		int totalBooks = 245;
		int shelfCapacity = 30;
		int remainBooks = totalBooks % shelfCapacity == 0 ? 0 : 1;
		// 필요한 책장 개수를 구하는 코드를 작성하세요.
		System.out.println(totalBooks / shelfCapacity + remainBooks);
		System.out.println();
		
//		문제 9: 연필 묶음 문제
//		연필이 총 243자루 있고, 12자루씩 묶음으로 만들려면 총 몇 묶음이 필요한가?
		int pencils = 243;
		int bundleSize = 12;
		// 필요한 묶음 수를 구하는 코드를 작성하세요.
		System.out.println(pencils / bundleSize);
		System.out.println();
		
//		문제 10: 택배 박스 문제
//		상품이 92개 있다. 택배 박스 하나에 7개씩 담을 수 있다면, 몇 개의 박스가 필요할까?
		int products = 92;
		int boxCapacity1 = 7;
		int remainProduct = products % boxCapacity1 == 0 ? 0 : 1;
		// 필요한 박스 수를 구하는 코드를 작성하세요.
		System.out.println(products / boxCapacity1 + remainProduct);
		System.out.println();
		
//		문제 11: 생일 케이크 문제
//		케이크가 총 16조각이다. 5명이 똑같이 나눠 먹을 때, 남는 조각 수는?
		int cakeSlices = 16;
		int numberOfPeople = 5;
		// 남는 케이크 조각 수를 구하는 코드를 작성하세요.
		System.out.println(cakeSlices % numberOfPeople);
		System.out.println();
		
//		문제 12: 사탕 나누기 문제
//		사탕 50개를 친구 6명과 나눌 때, 각 친구가 받을 수 있는 사탕 개수와 남는 사탕 개수는?
		int candies = 50;
		int friends = 6;
		// 각 친구가 받을 사탕 개수와 남는 사탕 개수를 구하는 코드를 작성하세요.
		System.out.println(candies / friends);
		System.out.println(candies % friends);
		System.out.println();
		
//		문제 13: 화분 배치 문제
//		화분 95개를 한 줄에 7개씩 배치할 수 있다. 화분을 배치하는 데 필요한 줄 수는 몇 줄인가?
		int pots = 95;
		int rowCapacity = 7;
		int remainPots = pots % rowCapacity == 0 ? 0 : 1;
		// 필요한 줄 수를 구하는 코드를 작성하세요.
		System.out.println(pots / rowCapacity + remainPots);
		System.out.println();
		
//		문제 14: 총 지불 금액 문제
//		책 3권의 가격이 각각 12,000원, 15,000원, 8,000원이다. 책을 모두 구매할 때의 총 금액은?
		int book1 = 12000;
		int book2 = 15000;
		int book3 = 8000;
		// 총 금액을 구하는 코드를 작성하세요.
		System.out.println(book1 + book2 + book3);
		System.out.println();
		
//		문제 15: 지하철 문제
//		지하철 한 칸에 150명이 탈 수 있다. 4개의 칸이 꽉 찼다면, 총 몇 명이 탔는가?
		int capacityPerCar = 150;
		int numberOfCars = 4;
		// 총 몇 명이 탔는지 구하는 코드를 작성하세요.
		System.out.println(capacityPerCar * numberOfCars);
		System.out.println();
		
//		문제 16: 학급 인원 문제
//		한 학급의 학생이 30명이다. 시험지 100장을 나눠주려면 학생당 몇 장씩 받을 수 있는가? 그리고 남는 시험지는 몇 장인가?
		int students = 30;
		int papers = 100;
		// 학생당 시험지 수와 남는 시험지 수를 구하는 코드를 작성하세요.
		System.out.println(papers / students);
		System.out.println(papers % students);
		System.out.println();
		
//		문제 17: 시계 문제
//		하루는 24시간이다. 지금 시간이 15시일 때, 10시간 후는 몇 시인가?
		int currentTime = 15;
		int hoursLater = 10;
		// 10시간 후의 시간을 구하는 코드를 작성하세요.
		System.out.println((currentTime + hoursLater) % 24);
		System.out.println();
		
//		문제 18: 농장 문제
//		한 마리의 닭이 하루에 2개의 달걀을 낳는다. 닭이 12마리 있을 때, 5일 동안 총 몇 개의 달걀을 얻을 수 있는가?
		int eggsPerDay = 2;
		int numberOfChickens = 12;
		int days = 5;
		// 총 얻을 수 있는 달걀 수를 구하는 코드를 작성하세요.
		System.out.println(numberOfChickens * eggsPerDay * days);
		System.out.println();
		
//		문제 19: 영화 시간 문제
//		영화 한 편의 길이가 120분이다. 영화를 3편 본다면, 총 몇 시간을 소모하게 되는가?
		int movieLength = 120;
		int numberOfMovies = 3;
		// 총 소모 시간을 구하는 코드를 작성하세요.
		System.out.println(movieLength / 24 * numberOfMovies);
		System.out.println();
		
//		운동장이 400m이다. 7바퀴를 달렸다면 총 몇 km를 달린 것인가?
		int trackLength = 400;
		int laps = 7;
		// 총 달린 거리를 km로 구하는 코드를 작성하세요.
		System.out.println((double)trackLength * laps / 1000);
		System.out.println();
		
	
//		달력 예시
		// / : 지연 , % : 순환
		for(int i = 1 ; i <= 31 ; i++) {
			int week = (i - 1) / 7 + 1; 
			
			if(i % 7 == 1) {
				System.out.printf("%d주차 ", week);
			}
			
			System.out.printf("%3d", i);
			if(i % 7 == 0) {
//			if(i == 7 || i == 14) {
				System.out.println();
			}			
		}			
		
	}
}
