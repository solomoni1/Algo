import java.util.HashSet;
import java.util.Scanner;

public class Solution_8993_하지추측 {
	public static HashSet<Long> hs = new HashSet<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			long N = sc.nextLong();
			boolean result = canEnd(N);
			String ans = "#" + tc + " " + (result ? "YES" : "NO");
			System.out.println(ans);
			hs.clear();
		}
	}

	public static boolean canEnd(long n) {
		if(hs.contains(n)) return false;
		if(n == 1) return true;
		hs.add(n);
		if((n & 1) == 1) {
			return canEnd(3 * n + 3);
		} else {
			return canEnd(n / 2);
		}
	}
}
