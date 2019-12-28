import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_3819_최대부분배열 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			int[] dp = new int[N];
			int ans = Integer.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(br.readLine());
				if(arr[i] > ans)ans = arr[i];
			}
			dp[0] = arr[0];
			for (int i = 1; i < dp.length; i++) {
				dp[i] = Math.max(0, dp[i-1]) + arr[i];
				if(dp[i] > ans) ans = dp[i];
			}
			System.out.printf("#%d %d\n", tc, ans);
		}
	}
}
