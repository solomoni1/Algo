import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8338_계산기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int[] num = new int[N];
			for (int i = 0; i < N; i++) {
				num[i]= Integer.parseInt(st.nextToken());
			}
			int ans = num[0];
			for (int i = 1; i < N; i++) {
				if(ans <= 1 || num[i] <= 1) {
					ans += num[i];
				} else {
					ans *= num[i];
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
