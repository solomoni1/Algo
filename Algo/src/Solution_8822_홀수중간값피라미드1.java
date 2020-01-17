import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8822_홀수중간값피라미드1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int ans = X == 1 || X == 2 * N - 1? 0 : 1;
			System.out.println("#" + tc + " " + ans);
		}
	}
}
