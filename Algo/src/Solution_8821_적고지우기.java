import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8821_적고지우기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			int len = s.length();
			boolean[] numbers = new boolean[10];
			for (int i = 0; i < len; i++) {
				int num = s.charAt(i) - '0';
				numbers[num] = !numbers[num];
			}
			int result = 0;
			for (int i = 0; i < numbers.length; i++) {
				if(numbers[i]) result++;
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
