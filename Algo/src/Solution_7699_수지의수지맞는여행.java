import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7699_수지의수지맞는여행 {
	private static char[][] land;
	private static boolean[][] visit;
	private static boolean[] alpha;
	private static int ans;
	private static int C;
	private static int R;
	private static final int[] row = {0,0,1,-1}; 
	private static final int[] col = {1,-1,0,0}; 

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			land = new char[R][C];
			visit = new boolean[R][C];
			alpha = new boolean[26];
			for (int i = 0; i < R; i++) {
				s = br.readLine();
				for (int j = 0; j < C; j++) {
					land[i][j] = s.charAt(j);
				}
			}
			ans = 0;
			visit[0][0] = true;
			alpha[land[0][0] - 'A'] = true;
			dfs(0,0,1);
			System.out.println("#" + tc + " " + ans);
		}
	}

	private static void dfs(int r, int c, int cnt) {
		if(cnt > ans) ans = cnt;
		for (int i = 0; i < 4; i++) {
			int rr = r + row[i];
			int cc = c + col[i];
			if(rr < 0 || rr >= R || cc < 0 || cc >= C) continue;
			int curAlpha = land[rr][cc] - 'A';
			if(!visit[rr][cc] && !alpha[curAlpha]) {
				visit[rr][cc] = true;
				alpha[curAlpha] = true;
				dfs(rr, cc, cnt+1);
				visit[rr][cc] = false;
				alpha[curAlpha] = false;
			}
		}
		
	}
}
