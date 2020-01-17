import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_9088_다이아몬드 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[] dia = new int[N];
			int result = 0;
			for (int i = 0; i < N; i++) {
				dia[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(dia);
			for (int i = 0; i < N; i++) {
				int min = dia[i];
				int max = 0;
				for (int j = i; j < N; j++) {
					if(dia[j] - min <= K) {
						max++;
					} else {
						break;
					}
				}
				if(max > result) result = max;
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
