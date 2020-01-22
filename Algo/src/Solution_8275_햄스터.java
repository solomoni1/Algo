import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8275_햄스터 {
	static class Rep {
		int s, e, n;
		public Rep(int s, int e, int n) {
			this.s = s;
			this.e = e;
			this.n = n;
		}
	}

	private static Rep[] rep;
	private static int X;
	private static int N;
	private static int[] cage;
	private static int[] ans;
	private static int max;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(str, " ");
			N = Integer.parseInt(st.nextToken());
			X = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			rep = new Rep[M];
			cage = new int[N + 1];
			ans = new int[N + 1];
			max = -1;
			for (int i = 0; i < M; i++) {
				str = br.readLine().trim();
				st = new StringTokenizer(str, " ");
				int s = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());
				rep[i] = new Rep(s, e, n);
			}
			for (int i = 0; i <= X; i++) {
				putHam(1, i, i);
			}
			String answer = "#" + tc;
			if(max < 0) {
				answer += " -1";
			} else {
				for (int i = 1; i <= N; i++) {
					answer += " " + ans[i];
				}
			}
			System.out.println(answer);
		}
	}

	private static void putHam(int cageNum, int hamNum, int tot) {
		cage[cageNum] = hamNum;
		if(cageNum == N) {
			if(check() && max < tot) {
				max = tot;
				for (int i = 1; i <= N; i++) {
					ans[i] = cage[i];
				}
			}
			return;
		}
		for (int i = 0; i <= X; i++) {
			putHam(cageNum + 1, i, tot + i);
		}
	}

	private static boolean check() {
		for (int i = 0; i < rep.length; i++) {
			int s = rep[i].s;
			int e = rep[i].e;
			int n = rep[i].n;
			int ham = 0;
			for (int j = s; j <= e; j++) {
				ham += cage[j];
			}
			if(ham != n) {
				return false;
			}
		}
		return true;
	}
}
