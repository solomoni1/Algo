import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8104_조만들기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[] group = new int[K];
			int d = 1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < K; j++) {
					if(i % 2 == 0) {
						group[j] += d++;
					} else {
						group[K-j-1] += d++;
					}
				}
			}
			String s = "";
			for (int i = 0; i < group.length; i++) {
				s += group[i] + " ";
			}
			System.out.println("#" + tc + " " + s);
		}
	}
}
