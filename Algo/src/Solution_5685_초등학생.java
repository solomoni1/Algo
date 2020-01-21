import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5685_초등학생 {
	public static final long M = 1234567891;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			int[] num = new int[N];
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s, " ");
			for (int i = 0; i < N; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			long[][] digit = new long[N-1][21];
			digit[0][num[0]]++;
			for (int i = 1; i < N-1; i++) {
				for (int j = 0; j <= 20; j++) {
					if(digit[i-1][j] > 0) {
						if(j + num[i] <= 20) {
							digit[i][j + num[i]] += digit[i-1][j];
							if(digit[i][j + num[i]] >= M) {
								digit[i][j + num[i]] %= M;
							}
						}
						if(j - num[i] >= 0) {
							digit[i][j - num[i]] += digit[i-1][j];
							if(digit[i][j - num[i]] >= M) {
								digit[i][j - num[i]] %= M;
							}
						}
					}
				}
			}
			long ans = digit[N-2][num[N-1]];
			System.out.println("#" + tc + " " + ans);
		}
	}
}
