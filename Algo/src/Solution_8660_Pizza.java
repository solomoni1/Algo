import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8660_Pizza {
	public static final int MAX_N = 100000;
	public static final int MAX_K = 50;
	public static final long DIV = 1000000007;
	public static long[][] dp = new long[MAX_N+1][MAX_K+1];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 2; i <= MAX_N; i += 2) {
			dp[i][2] = 2;
		}
		dp[1][1] = 1;
		for (int i = 3; i <= MAX_K; i++) {
			for (int j = i; j <= MAX_N; j++) {
				dp[j][i] = ((dp[j-2][i-1] + dp[j-1][i-1]) * i + dp[j-1][i] * (i - 2)
						+ dp[j-2][i] * (i - 1)) % DIV;
			}
		}
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			System.out.println("#" + tc + " " + dp[N][K]);
		}
	}
}
