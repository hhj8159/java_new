package java_new;

import java.util.Arrays;

public class Chap05_EXER1 {
	public static void main(String[] args) {
		int[] num = {30, 50, 20, 10, 40};
		System.out.println(Arrays.toString(num));
//		for(int i = 0; i < num.length; i++) {
////			System.out.println(num[i]);			
//		}
		
		int[] tmp = new int[num.length * 2];
		for(int i = 0; i < num.length; i++) {
			tmp[i] = num[i];			
		}
		System.out.println(Arrays.toString(tmp));
		System.out.println("==============================");
		num = tmp;
		System.out.println(Arrays.toString(num));
		
		
		
	}
}
