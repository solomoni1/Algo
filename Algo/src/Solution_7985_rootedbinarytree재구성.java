import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7985_rootedbinarytree재구성 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			String s = br.readLine();
			int bin = (int) Math.pow(2,N);
			int[] tree = new int[bin];
			StringTokenizer st = new StringTokenizer(s, " ");
			for (int i = 1; i < tree.length; i++) {
				tree[i] = Integer.parseInt(st.nextToken());
			}
		}
	}
}
