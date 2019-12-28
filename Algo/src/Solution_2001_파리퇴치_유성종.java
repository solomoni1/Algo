import java.util.Scanner;

public class Solution_2001_파리퇴치_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int cur_sum=0;
			int max=0;
			int[][] map = new int[N+1][N+1];
			for (int i = 0; i < N; i++) {
				map[N][i]=Integer.MIN_VALUE;
				map[i][N]=Integer.MIN_VALUE;
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					for (int p = 0; p < M; p++) {
						for (int q = 0; q < M; q++) {
							cur_sum+=map[i+p][j+q];
						}
					}
					if(cur_sum>max)
						max=cur_sum;
				}
			}
			System.out.println("#"+tc+" "+max);
		}
	}
}
