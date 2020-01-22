import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8743_경재와대환이의돌게임 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s, " ");
			long R = Long.parseLong(st.nextToken());
			long B = Long.parseLong(st.nextToken());
			System.out.println("#" + tc + " " + (Math.abs(R - B) < 2 ? "DH" : "KJ"));
		}
	}
}
