package ch6;

public class ScoreManager {

	
	public static void main(String[] args) {
		int[] korScore = new int[10];
		int[] engScore = new int[10];
		int[] mathScore = new int[10];
		
		korScore[0] = 100;
		korScore[1] = 63;
		korScore[2] = 77;
		korScore[3] = 96;
		korScore[4] = 43;
		korScore[5] = 56;
		korScore[6] = 89;
		korScore[7] = 90;
		korScore[8] = 62;
		korScore[9] = 89;
		
//		System.out.println(korScore[0]);
//		System.out.println(korScore[1]);
//		System.out.println(korScore[2]);
		// 반복문을 이용한 공통된 작업 처리
		for(int idx = 0; idx<korScore.length; idx++) {
			System.out.println(korScore[idx]);
		}
		
		// 평균 점수를 출력하는 프로그램
		// 합을 구하고 평균을 구한다.
		int sum = 0;
		for(int i = 0; i<korScore.length; i++) {
			sum += korScore[i];
		}
		System.out.println("국어 점수의 합은 : " + sum);
		
		// 평균 -> 총합 / 배열의 갯수
		float avg = (float)sum / korScore.length;
		System.out.println("국어 점수의 평균은 : " + avg);
	}
}
