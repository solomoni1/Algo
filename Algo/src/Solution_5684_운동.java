import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5684_운동 {
	public static int result;
	public static int[][] mat = new int[401][401];
	public static boolean[] visit;
	public static int N;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			String ss = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(ss, " ");
			result = Integer.MAX_VALUE;
			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
//			mat = new int[N+1][N+1];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					mat[i][j] = 0;
				}
			}
			visit = new boolean[N+1];
            int s =0, e = 0, d = 0;
			for (int i = 0; i < M; i++) {
				ss = br.readLine().trim();
				st = new StringTokenizer(ss, " ");
				s = Integer.parseInt(st.nextToken());
				e = Integer.parseInt(st.nextToken());
				d = Integer.parseInt(st.nextToken());
				mat[s][e] = d;
			}
			for (int i = 1; i <= N; i++) {
				visit[i] = true;
				dfs(i,i,0);
				visit[i] = false;
			}
			System.out.println("#" + tc + " " + result);
		}
		
	}

	public static void dfs(int node, int e, int d) {
		if(d > 0 && node == e) {
			if(d < result) {
				result = d;
			}
			return;
		}
		for (int i = 1; i <= N; i++) {
			if((!visit[i] && mat[node][i] > 0) || (d > 0 && e == i && mat[node][i] > 0)) {
				visit[i] = true;
				dfs(i, e, d + mat[node][i]);
				visit[i] = false;
			}
		}
	}
}
