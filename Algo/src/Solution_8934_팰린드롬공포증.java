import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8934_팰린드롬공포증 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			int a = 0;
			int b = 0;
			int c = 0;
			int len = s.length();
			for (int i = 0; i < len; i++) {
				char temp = s.charAt(i);
				if(temp == 'a') {
					a++;
				} else if(temp == 'b') {
					b++;
				} else {
					c++;
				}
			}
			boolean check = Math.abs(a - b) > 1 || Math.abs(a - c) > 1 || Math.abs(b - c) > 1;
			String result = check ? "NO" : "YES";
			System.out.println("#" + tc + " " + result);
		}
	}
}
