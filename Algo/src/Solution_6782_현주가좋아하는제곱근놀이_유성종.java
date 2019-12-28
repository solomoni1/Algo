import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_6782_현주가좋아하는제곱근놀이_유성종 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		long[] sq = new long[1000001];
		for(int i = 0;i <1000001;i++)
			sq[i]=(long)i*i;
		for (int tc = 1; tc <= T; tc++) {
			long N = Long.parseLong(br.readLine());
			int cnt=0;
			int num;
			while(N != 2) {
				double x = Math.sqrt(N);
				num=(int)Math.ceil(x);
				cnt+=sq[num]-N+1;
				N=num;
			}
			System.out.println("#"+tc+" "+cnt);
		}
	}
}
