import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7793_오나의여신님 {
	private static final int[] row = {0,0,1,-1};
	private static final int[] col = {1,-1,0,0};
	
	static class Coord{
		int r, c, dis;

		public Coord(int r, int c, int dis) {
			this.r = r;
			this.c = c;
			this.dis = dis;
		}
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			char[][] map = new char[N][M];
			int[][] dev = new int[2500][2];
			int devNum = 0;
			int sooR = 0;
			int sooC = 0;
			for (int i = 0; i < N; i++) {
				s = br.readLine();
				for (int j = 0; j < M; j++) {
					map[i][j] = s.charAt(j);
					if(map[i][j] == 'S') {
						sooR = i;
						sooC = j;
					} else if(map[i][j] == '*') {
						dev[devNum][0] = i;
						dev[devNum++][1] = j;
					}
				}
			}
			Coord[] q = new Coord[5000];
			int front = -1, rear = -1;
			q[++rear] = new Coord(sooR, sooC, 0);
			for (int i = 0; i < devNum; i++) {
				q[++rear] = new Coord(dev[i][0], dev[i][1], -1);
			}
			int min = 0;
			boolean end = false;
			while(front < rear) {
				Coord top = q[++front];
				for (int i = 0; i < 4; i++) {
					int r = top.r + row[i];
					int c = top.c + col[i];
					if(r >= N || r < 0 || c >= M || c < 0 || map[r][c] == 'X') continue;
					if(top.dis >= 0 && map[top.r][top.c] == 'S') {
						if(map[r][c] == 'D') {
							end = true;
							break;
						} else if(map[r][c] == '.'){
							q[++rear] = new Coord(r, c, top.dis + 1);
							map[r][c] = 'S';
						}
					} else if(top.dis < 0 && (map[r][c] == '.' || map[r][c] == 'S')) {
						q[++rear] = new Coord(r, c, -1);
						map[r][c] = '*';
					}
				}
				if(top.dis >= 0 && end) {
					min = top.dis + 1;
					break;
				}
			}
			String ans = "GAME OVER";
			if(end && min > 0) ans = "" + min;
			System.out.println("#" + tc + " " + ans);
		}
	}
}
