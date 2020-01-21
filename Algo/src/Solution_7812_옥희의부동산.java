import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7812_옥희의부동산 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int N = Integer.parseInt(st.nextToken());
			long M = Long.parseLong(st.nextToken());
			int[] land = new int[N];
			s = br.readLine();
			st = new StringTokenizer(s, " ");
			int ans = 0;
			long check = 0;
			for (int i = 0; i < land.length; i++) {
				land[i] = Integer.parseInt(st.nextToken());
				check += land[i];
			}
			
			if(check == M) ans++;
			check = 0;
			for (int i = N - 1; i >= 1; i--) {
				check = 0;
				for (int j = 0; j < i; j++) {
					check += land[j];
				}
				if(check == M) ans++;
				for (int j = 0; j < N - i; j++) {
					check -= land[j];
					check += land[i + j];
					if(check == M) ans++;
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
