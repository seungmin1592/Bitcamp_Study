package Practice;

import java.util.Scanner;

public class Test01 {
	// 최소값 반환
	public static int minVaule(int[] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	// 최대값 반환
	public static int maxVaule(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("arr배열의 최소값은 : ");
		System.out.println(Test01.minVaule(arr));
		
		System.out.print("arr배열의 최대값은 : ");
		System.out.println(Test01.maxVaule(arr));
		
		 

	}

}
