package java_new;

public class Chap03_EXER3 {
	public static void main(String[] args) {
//		문제 1: 영화관 할인 문제
//		영화관에서 13세 미만이거나 60세 이상일 경우 티켓 할인이 적용된다. 만약 나이가 45세라면, 할인이 적용되는지 확인하는 코드를 작성하세요.
		int age = 45;
		// 할인이 적용되는지 확인하는 조건을 작성하세요.
		boolean isDiscounted = age < 13 || age >= 60;
		System.out.println(isDiscounted); // 결과: false
		System.out.println();
		
//		문제 2: 쇼핑몰 배송비 문제
//		쇼핑몰에서 50,000원 이상 구매하면 무료 배송을 제공한다. 하지만 회원이 아닌 경우 10,000원을 더 지불해야 한다. 총 구매 금액이 60,000원이고, 회원이 아닌 경우 배송비를 포함한 총 지불 금액을 구하라.
		int totalPurchase = 60000;
		boolean isMember = false;
		int deliveryFee = (isMember) ? 0 : 10000;
		int totalCost = totalPurchase + deliveryFee;
		System.out.println(totalCost); // 결과: 70000
		System.out.println();
		
//		문제 3: 시험 합격 여부 문제
//		학생의 세 과목 점수는 각각 85점, 90점, 78점이다. 세 과목의 평균 점수가 80점 이상이고, 모든 과목이 70점 이상일 때 합격이다. 학생이 합격했는지 여부를 확인하는 코드를 작성하라.
		int subject1 = 85;
		int subject2 = 90;
		int subject3 = 78;
		boolean isPassed = (subject1 + subject2 + subject3) / 3 >= 80 && subject1 >= 70 && subject2 >= 70 && subject3 >= 70;
		System.out.println(isPassed); // 결과: true
		System.out.println();
		
//		문제 4: 상자에 물건 담기 문제
//		한 상자에는 최대 20개의 물건을 담을 수 있다. 만약 물건의 개수가 50개라면 상자가 두 개 이상 필요하다. 이때, 상자가 최소 두 개 이상 필요한지 확인하는 코드를 작성하세요.
		int items = 50;
		int boxCapacity = 20;
		boolean needsMoreThanOneBox = (items / boxCapacity >= 2);
		System.out.println(needsMoreThanOneBox); // 결과: true
		System.out.println();
		
//		문제 5: 택배 무게 제한 문제
//		택배 상자의 무게 제한이 30kg이다. 상품 세 개의 무게가 각각 10kg, 12kg, 8kg일 때, 이 세 개의 상품을 하나의 상자에 담을 수 있는지 확인하는 코드를 작성하세요.
		int product1 = 10;
		int product2 = 12;
		int product3 = 8;
		boolean canFitInOneBox = (product1 + product2 + product3 <= 30);
		System.out.println(canFitInOneBox); // 결과: true
		System.out.println();
		
//		문제 6: 영화 추천 문제
//		사용자의 취향에 맞는 영화를 추천하려 한다. 사용자는 "액션"이나 "코미디" 장르를 좋아한다고 가정하자. 추천하려는 영화의 장르가 "액션"일 때, 사용자가 이 영화를 좋아하는지 확인하는 코드를 작성하라.
		String movieGenre = "액션";
		boolean isFavorite = (movieGenre.equals("액션"));
		System.out.println(isFavorite); // 결과: true
		System.out.println();
				
//		문제 7: 주차 요금 계산 문제
//		주차 요금은 첫 2시간까지 5,000원이고, 이후에는 한 시간당 1,000원씩 추가된다. 주차 시간이 5시간이라면, 주차 요금을 계산하는 코드를 작성하라.
		int parkingTime = 5;
		int fee = parkingTime <= 2 ? 5000 : 5000 + 1000 * (parkingTime - 2);
		System.out.println(fee); // 결과: 8000
		System.out.println();
		
//		문제 8: 비밀번호 확인 문제
//		사용자가 입력한 비밀번호가 "abcd1234"일 때, 입력한 비밀번호가 맞는지 확인하는 코드를 작성하세요.
		String correctPassword = "abcd1234";
		String enteredPassword = "abcd1234";
		boolean isCorrect = correctPassword.equals(enteredPassword);
		System.out.println(isCorrect); // 결과: true
		System.out.println();
		
//		문제 9: 할인 쿠폰 적용 문제
//		총 구매 금액이 100,000원 이상이면 10% 할인을 받을 수 있다. 구매 금액이 85,000원일 때, 할인 적용 여부를 확인하는 코드를 작성하라.
		int purchaseAmount = 85000;
		boolean isDiscountApplied = (purchaseAmount >= 100000);
		System.out.println(isDiscountApplied); // 결과: false
		System.out.println();
		
//		문제 10: 등급 판정 문제
//		학생의 점수가 90점 이상이면 "A", 80점 이상이면 "B", 70점 이상이면 "C", 나머지는 "F"로 등급이 판정된다. 학생의 점수가 88점일 때, 등급을 출력하는 코드를 작성하세요.
		int score = 88;
		String grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "F";
		System.out.println(grade); // 결과: B
		System.out.println();
		
//		문제 11: 연령별 관람 등급 문제
//		영화의 연령 제한이 18세 이상이다. 사용자의 나이가 17세일 때, 영화를 관람할 수 있는지 확인하는 코드를 작성하라.
		int userAge = 17;
		boolean canWatch = userAge >= 18;
		System.out.println(canWatch); // 결과: false
		System.out.println();
		
//		문제 12: 보너스 지급 문제
//		회사의 보너스 지급 조건은 근속 연수가 5년 이상이거나 프로젝트를 성공적으로 완료한 경우이다. 근속 연수가 4년이고, 프로젝트는 성공적으로 완료하지 못했다면, 보너스를 받을 수 있는지 확인하는 코드를 작성하세요.
		int yearsOfService = 4;
		boolean projectSuccess = false;
		boolean isBonusEligible = yearsOfService >= 5 || projectSuccess;
		System.out.println(isBonusEligible); // 결과: false
		System.out.println();
		
//		문제 13: 세일 기간 문제
//		현재 세일이 진행 중인지 확인하는 코드를 작성하라. 세일 기간은 매년 10월에서 12월 사이이며, 현재 달이 11월이다.
		int currentMonth = 11;
		boolean isSaleActive = currentMonth >= 10 && currentMonth <= 12;
		System.out.println(isSaleActive); // 결과: true
		System.out.println();
		
//		문제 14: 미성년자 판단 문제
//		한국에서는 만 19세 미만일 경우 미성년자로 간주된다. 나이가 18세라면 미성년자인지 여부를 확인하는 코드를 작성하세요.
		int age1 = 18;
		boolean isMinor = (age1 < 19);
		System.out.println(isMinor); // 결과: true
		System.out.println();
		
//		문제 15: 직원 평가 문제
//		직원의 연간 성과가 "우수" 또는 "보통"일 경우, 보너스를 지급한다. 성과가 "우수"일 때, 보너스 지급 여부를 확인하는 코드를 작성하세요.
		String performance = "우수";
		boolean isBonusGiven = (performance.equals("우수"));
		System.out.println(isBonusGiven); // 결과: true
		System.out.println();
		
//		문제 16: 휴대폰 요금제 선택 문제
//		사용자가 한 달에 사용하는 데이터가 5GB 이상이거나 통화 시간이 300분 이상일 경우 무제한 요금제를 추천한다. 사용자의 데이터 사용량이 4GB이고, 통화 시간이 350분일 때 무제한 요금제를 추천할지 여부를 확인하는 코드를 작성하세요.
		int dataUsage = 4;
		int callMinutes = 350;
		boolean isUnlimitedPlanRecommended = (dataUsage >= 5 || callMinutes >= 300);
		System.out.println(isUnlimitedPlanRecommended); // 결과: true




		
		
		
		


	}
}
