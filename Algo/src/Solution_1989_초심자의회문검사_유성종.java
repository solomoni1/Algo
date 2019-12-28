import java.util.Arrays;
import java.util.Scanner;

public class Solution_1989_초심자의회문검사_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 1; tc <= T; tc++) {
			int ans=1;
			String s = sc.nextLine();
			for (int i = 0; i < s.length()/2; i++) {
				if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
					ans=0;
					break;
				}
			}
			System.out.println("#"+tc+" "+ans);
		}
	}
}
