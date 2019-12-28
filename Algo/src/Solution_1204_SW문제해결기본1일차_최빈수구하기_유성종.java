import java.util.Scanner;

public class Solution_1204_SW문제해결기본1일차_최빈수구하기_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int t = sc.nextInt();
			int[] score = new int[101];
			int max=-1;
			int ans=-1;
			for (int i = 0; i < 1000; i++) {
				int num = sc.nextInt();
				score[num]++;
			}
			for (int i = score.length-1; i >= 0; i--) {
				if(max < score[i]) {
					max = score[i];
					ans = i;
				}
			}
			System.out.println("#" + t + " " + ans);
		}
	}
}
