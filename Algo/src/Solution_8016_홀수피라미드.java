import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8016_홀수피라미드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			long N = Integer.parseInt(br.readLine());
			long left = 2 * N * N - 4 * N + 3;
			long right = 2 * N * N - 1;
			System.out.println("#" + tc + " "+ left + " " + right);
		}
	}
}
