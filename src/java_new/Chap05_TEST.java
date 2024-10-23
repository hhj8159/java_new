package java_new;

import java.util.Arrays;
import java.util.Scanner;

public class Chap05_TEST {
	public static void main(String[] args) {
		// 30, 40, 20, 10, 50, 1
		// 1. 배열 생성 후 합계/평균 출력
		
		int[] num = {30, 40, 20, 10, 50, 1};
		System.out.println(Arrays.toString(num));
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		double avg = (double)sum / num.length;
		avg = (int)(avg * 100) / 100d;
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println();
		
		// 1, 3, 2, 7, 8, 2
		// 2. 배열 생성 후 짝수의 갯수 구하기
		int[] arr = {1, 3, 2, 7, 8, 2};
		System.out.println(Arrays.toString(arr));
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		System.out.println();
		
		// int 배열의 중간값 계산
		// {1,2,3,4,5} 3 홀수일때는 단일 값
		// {4,5,2,3,4,1} 2.5 짝수일 때는 두 수의 평균
		
		arr = new int[] {1, 2, 3, 4, 5};
		System.out.println(arr.length % 2 == 1 ? arr[arr.length / 2] : arr[arr.length / 2] + arr[arr.length / 2 - 1] / 2d);
		System.out.println();
		// 4. 배열의 요소 뒤집기 (순서 역순 만들기)
		arr = new int[] {1, 2, 3, 4, 5};
		int[] tmp = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			tmp[arr.length - 1 - i] = arr[i];
		}
		arr = tmp;		
		System.out.println(Arrays.toString(arr));

		// 5. 포함여부 묻기
		// {1,2,3,4,5}		5입력시 포함됨 6입력시 포함되지 않음
		int input = Integer.parseInt(new Scanner(System.in).nextLine());
		arr = new int[] {1, 2, 3, 4, 5};
		boolean b = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				b = true;
				break;
			}
		}
		
		
		// 배열의 특정 구간의 합계 구하기
		// ex)
		
		// 배열의 값이 좌우 대칭인지 확인
//		arr = new int[] {1,2,3,2,1}; 대칭입니다. 대칭이아닙니다.
		arr = new int[] {1, 2, 3, 4, 5};
		tmp = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			tmp[arr.length -1 -i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(tmp));
		
		boolean result = true; // true대칭이다.
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != tmp[i]) {
				result = false;
				break;
			}
		}
		System.out.println(result ? "대칭" : "대칭아님");
		
		// findBy
		
		
		
		
	}
}
