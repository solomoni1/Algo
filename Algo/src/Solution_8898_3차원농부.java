import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_8898_3차원농부 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] cows = new int[N];
			int[] horses = new int[M];
			s = br.readLine();
			st = new StringTokenizer(s, " ");
			int d = Integer.parseInt(st.nextToken());
			d -= Integer.parseInt(st.nextToken());
			d = d >= 0 ? d : -d;
			
			s = br.readLine();
			st = new StringTokenizer(s, " ");
			for (int i = 0; i < cows.length; i++) {
				cows[i] = Integer.parseInt(st.nextToken());
			}
			s = br.readLine();
			st = new StringTokenizer(s, " ");
			for (int i = 0; i < horses.length; i++) {
				horses[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(cows);
			Arrays.sort(horses);
			System.out.println("#" + tc + " ");
		}
	}
}
