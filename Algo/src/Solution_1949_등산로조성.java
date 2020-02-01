import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1949_등산로조성 {
	private static int N;
	private static int K;
	private static int[][] map;
	private static boolean[][] visit;
	private static int ans;
	private static int[][] maxC;
	private static final int[] row = {1,0,-1,0};
	private static final int[] col = {0,1,0,-1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			map = new int[N+2][N+2];
			visit = new boolean[N+2][N+2];
			ans = 0;
			maxC = new int[5][2];
			int ind = 0;
			int max = 0;
			for (int i = 1; i <= N; i++) {
				s = br.readLine();
				st = new StringTokenizer(s, " ");
				for (int j = 1; j <= N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if(map[i][j] > max) max = map[i][j];
				}
			}
			for (int i = 0; i < N + 2; i++) {
				map[0][i] = 100;
				map[i][0] = 100;
				map[N+1][i] = 100;
				map[i][N+1] = 100;
			}
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if(map[i][j] == max) {
						maxC[ind][0] = i;
						maxC[ind++][1] = j;
					}
				}
			}
			for (int i = 0; i < ind; i++) {
				visit[maxC[i][0]][maxC[i][1]] = true;
				dfs(maxC[i][0], maxC[i][1], 1, false);
				visit[maxC[i][0]][maxC[i][1]] = false;
			}
			
			System.out.println("#" + tc + " " + ans);
		}
	}

	private static void dfs(int r, int c, int d, boolean isWorked) {
		if(d > ans) ans = d;
		for (int i = 0; i < 4; i++) {
			int rr = r + row[i];
			int cc = c + col[i];
			if(!visit[rr][cc]) {
				if(map[rr][cc] >= map[r][c]) {
					if(isWorked) continue;
					if(map[rr][cc] - K < map[r][c]) {
						int temp = map[rr][cc];
						map[rr][cc] = map[r][c] - 1;
						visit[rr][cc] = true;
						dfs(rr, cc, d + 1, true);
						map[rr][cc] = temp;
						visit[rr][cc] = false;
					}
				} else {
					visit[rr][cc] = true;
					dfs(rr, cc, d + 1, isWorked);
					visit[rr][cc] = false;
				}
			}
		}
		
	}
	
}
