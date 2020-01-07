import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8840_아바바바 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int L = Integer.parseInt(br.readLine());
			long N = L/2;
			long result = N * N;
			System.out.println("#" + tc + " " + result);
		}
	}
}
