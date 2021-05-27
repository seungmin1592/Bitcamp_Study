package Practice;

public class Test02 {
	public static void addOneDArr(int[][] arr, int add) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + 1 + "번째의 배열");
			System.out.println("-------");
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] += add;
				System.out.println(arr[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = {
				{10,20,30,40},
				{1,2,3,4,5},
				{11,12,13,14,15,16}
		};
		Test02.addOneDArr(arr,5);

	}

}
