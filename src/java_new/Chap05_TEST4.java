package java_new;

import java.util.Arrays;

public class Chap05_TEST4 {
	public static void main(String[] args) {
		// 정수형 배열을 생성한 후, 배열의 최대값과 최소값을 찾아서 출력하세요.
		int[] arr = {4, 7, 2, 8, 1, 3};
		int max = arr[0];
		int min = arr[0];

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}		
		System.out.println(max);
		System.out.println(min);
		System.out.println();
				
		// 정수형 배열을 생성한 후, 배열에 포함된 홀수의 개수를 구하세요.
		arr = new int[] {5, 7, 2, 9, 1, 4};
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				cnt++;
			}			
		}
		System.out.println(cnt);
		System.out.println();
		
		// 정수형 배열을 생성한 후, 배열의 중앙값을 계산하여 출력하세요. (배열의 길이가 짝수일 경우 두 중앙값의 평균을 사용)
		arr = new int[] {5, 8, 2, 1, 5};
		System.out.println(arr.length % 2 == 1 ? arr[arr.length / 2] : (arr[arr.length / 2] + arr[arr.length / 2  - 1]) / 2d);
		System.out.println();
		
		// 정수형 배열을 생성한 후, 각 요소를 2로 나눈 값을 새로운 배열에 저장하고 출력하세요.
		arr = new int[] {5, 8, 2, 1, 5, 6,  10};
		int[] tmp = new int[arr.length];
	
//		tmp[0] = arr[0] / 2;
//		tmp[1] = arr[1] / 2;
//		tmp[2] = arr[2] / 2;
//		tmp[3] = arr[3] / 2;
//		tmp[4] = arr[4] / 2;
		
		for(int i =0; i < arr.length; i++) {
			tmp[i] = arr[i] / 2;
		}
		System.out.println(Arrays.toString(tmp));
		System.out.println();
		
		
		// 배열의 요소가 특정 값과 같은지 확인하기
		arr = new int[] {5, 8, 2, 1};
		int a = 5;
		boolean b = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == a) {
				b = true;
				break;
			}
			
		}
		System.out.println(b);
		System.out.println();
//			if(arr[i] == a) {
//				System.out.println("배열포함");
//				break;
//			}
//			if(arr[i] != a) {
//				System.out.println("배열미포함");
//				break;
//			}
		
		
		// 정수형 배열을 생성한 후, 배열을 오름차순으로 정렬하고 정렬된 배열을 출력하세요.
		arr = new int[] {5, 8, 1, 2, 10, 6};
		int[] tmp1 = new int[arr.length];
		int tmp2 = 0;
	
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					tmp2 = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp2;					
//					tmp1[j] = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = tmp1[j];					
				}				
			}			
		}
//		arr = tmp1;
		System.out.println(Arrays.toString(arr));
		
//		for(int i = 0; i < arr.length; i++) {
//			tmp1[arr.length - 1 - i] = arr[i];
//			
//		}
//		arr = tmp1;
//		System.out.println(Arrays.toString(arr));
		
		
		// 배열을 생성한 후, 중복된 요소를 제거하고 결과 배열을 출력하세요.
		// 배열을 생성한 후, 각 요소를 제곱하여 새로운 배열에 저장하고 출력하세요.
		// 배열을 생성한 후, 첫 번째 요소와 마지막 요소의 값을 교환하고 변경된 배열을 출력하세요.
		// 정수형 배열을 생성한 후, 주어진 특정 값보다 큰 요소의 개수를 세어 출력하세요.
		// 정수형 배열을 생성한 후, 모든 요소의 합계가 짝수인지 확인하고 결과를 출력하세요.
	}
}
