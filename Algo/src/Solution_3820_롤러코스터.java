import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3820_롤러코스터 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] rails = new int[N][2];
			int bigN = 1000000007;
			long v = 1;
			String s;
			StringTokenizer st;
			for (int i = 0; i < rails.length; i++) {
				s = br.readLine();
				st = new StringTokenizer(s, " ");
				rails[i][0] = Integer.parseInt(st.nextToken());
				rails[i][1] = Integer.parseInt(st.nextToken());
			}
			
			int ans = 0;
			System.out.printf("#%d %d", tc, ans);
		}
	}
}
