package Practice;
	
public class Test03 {
	public static void change(int[][] arr) {
		int[] n;
		for(int i = arr.length-1; i > 0; i--) {
			n = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = n;
		}
	}
	
	public static void print(int[][] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		System.out.println("변경 전");
		Test03.print(arr);
		Test03.change(arr);
		System.out.println("변경 후");
		Test03.print(arr);
	}
	
	
	
}
