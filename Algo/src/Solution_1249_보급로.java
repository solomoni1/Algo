import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1249_보급로 {
	private static int N;
	private static int[][] map;
	private static int[][] memo;
	private static int min;
	private static boolean[][] visit;
	private static final int[] row = {1,0,-1,0};
	private static final int[] col = {0,1,0,-1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine().trim());
			map = new int[N][N];
			memo = new int[N][N];
			min = Integer.MAX_VALUE;
			visit = new boolean[N][N];
			for (int i = 0; i < map.length; i++) {
				String s = br.readLine();
				for (int j = 0; j < map.length; j++) {
					map[i][j] = s.charAt(j) - '0';
				}
			}
			visit[0][0] = true;
			dfs(0,0,0);
			System.out.println("#" + tc + " " + min);
		}
	}

	private static void dfs(int r, int c, int t) {
		if(min <= t) return;
		if(r == N - 1 && c == N - 1) {
			if(t < min) min = t;
			return;
		}
		if(memo[r][c] == 0 || memo[r][c] > t) {
			memo[r][c] = t;
		} else {
			return;
		}
		for (int i = 0; i < 4; i++) {
			int rr = r + row[i];
			int cc = c + col[i];
			if(rr >= N || rr < 0 || cc >= N || cc < 0) continue;
			if(!visit[rr][cc] && t + map[rr][cc] < min) {
				visit[rr][cc] = true;
				dfs(rr, cc, t + map[rr][cc]);
				visit[rr][cc] = false;
			}
		}
	}
}
