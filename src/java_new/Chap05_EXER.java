package java_new;

import java.util.*;

public class Chap05_EXER {
	public static void main(String[] args) {
		//ex01
		int[] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;	// score[2] = 70
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4];	// int tmp = score[3] + score[4]
		// for문으로 배열의 모든 요소를 출력한다
		for(int i = 0; i < 5; i++) {
			System.out.printf("score[%d] : %d%n", i, score[i]);
		}
		System.out.printf("tmp : %d%n", tmp);
//		System.out.printf("score[%d] : %d%n", 7, score[7]); //index의 범위를 벗어난 값
		System.out.println();
		
		//ex02
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;	// 1~10의 숫자를 순서대로 배열에 넣는다.
		}
	
		for(int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1;	// 1~10의 값을 배열에 저장.
		}
		// 배열에 저장된 값들을 출력한다.
		for(int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		System.out.println();
		
		//ex03
		int[] arr = new int[5];
		
		// 배열 arr에 1~5를 저장한다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}		
		System.out.println("[변경전]");
		System.out.println("arr.length : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		int[] tmp1 = new int[arr.length * 2];
		
		// 배열 arr에 저장된 값들을 배열tmp에 복사한다.
		for(int i = 0; i < arr.length; i++) {
			tmp1[i] = arr[i];
		}
		arr = tmp1;	// tmp에 저장된 값을 arr에 저장한다.
		
		System.out.println("[변경후]");
		System.out.println("arr.length : " + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println();
		
		//ex04
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		// 배열 abc를 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		// number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		System.out.println();
		
		//ex05
		int sum = 0;		// 총점을 저장하기 위한 변수
		float average = 0f; // 평균을 저장하기 위한 변수
		
		int[] score1 = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score1.length; i++) {
			sum += score1[i];
		}
		average = sum / (float)score1.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println();
		
		//ex06
		int[] score2 = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score2[0];
		int min = score2[0];
		
		for(int i = 1; i < score2.length; i++) {
			if(score2[i] > max) {
				max = score2[i];
			}
			else if(score2[i] < min) {
				min = score2[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println();
		
		//ex07
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;		// 배열을 0~9의 숫자로 초기화한다.
			System.out.println(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10);
			int tmp2 = numArr[0];	// tmp2에 numArr 인덱스0의 값을 담는다.
			numArr[0] = numArr[n];	// numArr 익덱스n(n에는 반복문을 통해 뽑은 0~9 사이의 무작위 숫자가 담겨있다)을 numArr 인덱스0에 담는다. numArr[0]과 numArr[n]에 담긴 값은 같아진다.
			numArr[n] = tmp2;		// numArr 인덱스n에 tmp2(tmp2는 numArr의 인덱스0의 값을 담고 있다)를 대입한다. 인덱스0과 인덱스n은 이제 같은 값이 아니게 되었다.
		}
		// 위의 반복문에서 인덱스에 담긴 값들을 섞어주었으니, 섞인 인덱스 값을 나열해주는 반복문을 작성
		for(int  i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
		System.out.println();
		System.out.println();
		
		//ex08
		int[] ball = new int[45];	// 45개의 정수값을 저장하기 위한 배열 생성.
		
		// 배열의 각 요소에 1~45의 값을 저장한다.
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;	// ball[0]에 1이 저장된다.
		}
		int temp = 0;	// 두 값을 바꾸는데 사용할 임시변수
		int j = 0;		// 임의의 값을 얻어서 저장할 변수
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		// 0번째부터 5번째 요소까지 모두 6개만 바꾼다.
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);	// 0~44 범위의 임의의 값을 얻는다.
			temp = ball[i];
			ball[i]	= ball[j];
			ball[j] = temp;				// ball[i]와 ball[j]의 값을 서로 바꾼다.
		}
		// 배열 ball의 앞에서부터 6개의 요소를 출력한다.
		for(int i = 0; i < 6; i++) {
			System.out.printf("ball[%d] = %d%n", i, ball[i]);
		}
		System.out.println();
		
		//ex09
		int[] code = {-4, -1, 3, 6, 11};	// 불연속적인 값들로 구성된 배열
		int[] arr1 = new int[10];
		
		for (int i = 0; i < arr1.length; i++) {
			int tmp2 = (int)(Math.random() * code.length);
			arr1[i] = code[tmp2];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
		//ex10
		int[] numArr1 = new int[10];
		
		for(int i = 0; i < numArr1.length; i++) {
			System.out.print(numArr1[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for(int i1 = 0; i1 < numArr1.length - 1; i1++) {
			boolean changed = false;	// 자리바꿈이 발생했는지를 체크한다.
			
			for(int j1 = 0; j1 < numArr1.length - 1 - i1; j1++) {
				if(numArr1[j1] > numArr1[j1 + 1]) {	// 옆의 값이 작으면 서로 바꾼다.
					int temp1 = numArr1[j1];
					numArr1[j1] = numArr1[j1 + 1];
					numArr1[j1 + 1] = temp1;
					changed = true;					// 자리바꿈이 발생했으니 changed를 true로.					
				}
			}
			if (!changed) break;					// 자리바꿈이 없으면 반복문을 벗어난다.
			
			for(int k1 = 0; k1 < numArr1.length; k1++) {
				System.out.print(numArr1[k1]);		// 정렬된 결과를 출력한다.
			}
			System.out.println();
		}
		System.out.println();
		
		//ex11
		int[] numArr2 = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0; i < numArr2.length; i++) {	
			numArr2[i] = (int)(Math.random() * 10);		// 0~9의 임의의 수를 배열에 저장
			System.out.print(numArr2[i]);
		}
		System.out.println();
		
		for(int i = 0; i < numArr2.length; i++) {
			counter[numArr2[i]]++;
		}
		
		for(int i = 0; i < numArr2.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
		
	}
}
