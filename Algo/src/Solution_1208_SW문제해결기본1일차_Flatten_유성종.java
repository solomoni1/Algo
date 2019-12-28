import java.util.Scanner;

public class Solution_1208_SW문제해결기본1일차_Flatten_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 3; tc++) {	
			int dump = sc.nextInt();
			int[] box = new int[100];
			for (int i = 0; i < 100; i++) {
				box[i] = sc.nextInt();
			}
			for (int j = box.length-1; j >0; j--) {
				for (int k = 0; k < j; k++) {
					if(box[k]>box[k+1]) {
						int temp = box[k];
						box[k] = box[k+1];
						box[k+1] = temp;
					}
				}
			}
			for (int i = 0; i < dump; i++) {
				if(box[99]-box[0] <= 1)
					break;
				box[99]--;
				box[0]++;
				for (int j = box.length-1; j >0; j--) {
					for (int k = 0; k < j; k++) {
						if(box[k]>box[k+1]) {
							int temp = box[k];
							box[k] = box[k+1];
							box[k+1] = temp;
						}
					}
				}
			}	
			System.out.println("#"+tc+" "+(box[99]-box[0]));
		}
	}
}
