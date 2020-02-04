import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1767_프로세서연결하기 {
	static class Core {
		int r, c;
		public Core(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	private static int N;
	private static int[][] chip;
	private static Core[] cores;
	private static int coreNum;
	private static int cmax;
	private static int lmin;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			chip = new int[N][N];
			cores = new Core[12];
			coreNum = 0;
			for (int i = 0; i < chip.length; i++) {
				String s = br.readLine();
				StringTokenizer st = new StringTokenizer(s, " ");
				for (int j = 0; j < chip.length; j++) {
					chip[i][j] = Integer.parseInt(st.nextToken());
					if(chip[i][j] == 1 && i != 0 && i != N-1 && j != 0 && j != N-1) {
						cores[coreNum++] = new Core(i, j);
					}
				}
			}
			cmax = 0;
			lmin = 0;
			for (int i = 0; i < coreNum; i++) {
				int r = cores[i].r;
				int c = cores[i].c;
				for (int j = 0; j < 4; j++) {
					if(check(r, c, j)) {
						back(cores[i], i, 1, conCore(r, c, j));
						disCore(r, c, j);
					} else {
						back(cores[i], i, 0, 0);
					}
				}
			}
			System.out.println("#" + tc + " " + lmin);
		}
	}
	private static void back(Core core, int node, int cnt, int line) {
		if(cnt == coreNum) {
			if(cnt > cmax) {
				cmax = cnt;
				lmin = line;
			} else if(cnt == cmax && lmin > line) {
				lmin = line;
			}
			return;
		}
		if(cnt > cmax) {
			cmax = cnt;
			lmin = line;
		} else if(cnt == cmax && lmin > line) {
			lmin = line;
		}
		for (int i = node + 1; i < coreNum; i++) {
			int r = cores[i].r;
			int c = cores[i].c;
			for (int j = 0; j < 4; j++) {
				if(check(r, c, j)) {
					back(cores[i], i, cnt+1, line + conCore(r, c, j));
					disCore(r, c, j);
				} else {
					back(cores[i], i, cnt, line);
				}
			}
		}
		
	}
	private static int conCore(int r, int c, int dir) {
		int res = 0;
		if(dir == 0) {//east
			for (int i = c + 1; i < N; i++) {
				chip[r][i] = -1;
				res++;
			}
			return res;
		} else if(dir == 1) {//west
			for (int i = c - 1; i >= 0; i--) {
				chip[r][i] = -1;
				res++;
			}
			return res;
		} else if(dir == 2) {//south
			for (int i = r + 1; i < N; i++) {
				chip[i][c] = -1;
				res++;
			}
			return res;
		} else {//north
			for (int i = r - 1; i >= 0; i--) {
				chip[i][c] = -1;
				res++;
			}
			return res;
		}
	}
	private static void disCore(int r, int c, int dir) {
		if(dir == 0) {//east
			for (int i = c + 1; i < N; i++) {
				chip[r][i] = 0;
			}
		} else if(dir == 1) {//west
			for (int i = c - 1; i >= 0; i--) {
				chip[r][i] = 0;
			}
		} else if(dir == 2) {//south
			for (int i = r + 1; i < N; i++) {
				chip[i][c] = 0;
			}
		} else {//north
			for (int i = r - 1; i >= 0; i--) {
				chip[i][c] = 0;
			}
		}
	}
	private static boolean check(int r, int c, int dir) {
		if(dir == 0) {//east
			for (int i = c + 1; i < N; i++) {
				if(chip[r][i] != 0) {
					return false;
				}
			}
		} else if(dir == 1) {//west
			for (int i = c - 1; i >= 0; i--) {
				if(chip[r][i] != 0) {
					return false;
				}
			}
		} else if(dir == 2) {//south
			for (int i = r + 1; i < N; i++) {
				if(chip[i][c] != 0) {
					return false;
				}
			}
		} else {//north
			for (int i = r - 1; i >= 0; i--) {
				if(chip[i][c] != 0) {
					return false;
				}
			}
		}
		return true;
	}
}
