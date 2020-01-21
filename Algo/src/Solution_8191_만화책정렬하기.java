import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8191_만화책정렬하기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			boolean[] check = new boolean[N+1];
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int ans = 0;
			for (int i = 1; i <= N; i++) {
				int cur = Integer.parseInt(st.nextToken());
				check[cur] = true;
				if(!check[cur-1]) ans++;
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
