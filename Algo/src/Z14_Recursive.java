/**
 * 재귀함수
 *
 */

public class Z14_Recursive {
	static int[] memo=new int[10];
	public static int f(int n) {
		if(n>=2&&memo[n]==0) {
			memo[n]=f(n-1)+f(n-2);
			return memo[n];
		}
		return memo[n];
	}
	public static void main(String[] args) {
		memo[0]=0;
		memo[1]=1;
		System.out.println(f(8));
		
//		DP 동적계획법 : f(8) 7 6 5 4 3 2 1 0 어차피 필요한 부분들이니까 작은 해부터 구해서 올라오자
		int[] dp = new int[9];
		dp[0]=0;
		dp[1]=1;
		for (int i = 2; i < dp.length; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		System.out.println(dp[8]);
	}
}
