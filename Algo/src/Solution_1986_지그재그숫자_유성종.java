import java.util.Scanner;

public class Solution_1986_지그재그숫자_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int ans;
			if(N%2==0)
				ans=-1*(N/2);
			else
				ans=-1*(N/2)+N;
			System.out.println("#"+tc+" "+ans);
		}
	}
}
