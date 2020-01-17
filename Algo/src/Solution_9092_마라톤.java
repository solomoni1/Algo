import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_9092_마라톤 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] check = new int[N][2];
			int[][] route = new int[N][N];
			int[][] dp = new int[N][N-K+1];
			
			for (int i = 0; i < N; i++) {
				s = br.readLine();
				st = new StringTokenizer(s, " ");
				check[i][0] = Integer.parseInt(st.nextToken());
				check[i][1] = Integer.parseInt(st.nextToken());
			}
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					route[i][j] = Math.abs(check[i][0] - check[j][0]) + Math.abs(check[i][1] - check[j][1]);
				}
			}
			for (int i = 1; i < N; i++) {
				for (int j = 2; j <= i + 1 && j <= N - K; j++) {
					if(j == 2) {
						dp[i][j] = route[0][i];
					} else {
						int min = Integer.MAX_VALUE;
						for (int k = j - 2; k < i; k++) {
							min = Math.min(min, dp[k][j-1] + route[k][i]);
						}
						dp[i][j] = min;
					}
				}
			}
			System.out.println("#" + tc + " " + dp[N-1][N-K]);
		}
	}
}
