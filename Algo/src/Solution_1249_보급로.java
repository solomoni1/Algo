import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1249_보급로 {
	static class Coord{
		int r, c, d;
		Coord(int r, int c, int d){
			this.r = r;
			this.c = c;
			this.d = d;
		}
	}
	private static int N;
	private static int[][] map;
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
			min = Integer.MAX_VALUE;
			visit = new boolean[N][N];
			for (int i = 0; i < map.length; i++) {
				String s = br.readLine();
				for (int j = 0; j < map.length; j++) {
					map[i][j] = s.charAt(j) - '0';
				}
			}
			Coord[] q = new Coord[50000];
			int rear = -1, front = -1;
			q[++rear] = new Coord(0, 0, map[0][0]);
			while(rear > front) {
				
			}
			System.out.println("#" + tc + " " + min);
		}
	}
	public static void enqueue(Coord c) {
		
	}
}
