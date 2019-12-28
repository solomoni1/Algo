import java.util.Scanner;

public class Solution_1979_어디에단어가올수있을까_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int ans=0;
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] cross = new int[N+2][N+2];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					cross[i][j]= sc.nextInt();
				}
			}
			for (int i = 1; i <= N-K+1; i++) {
				for (int j = 1; j <= N-K+1; j++) {
					int con_j=1;
					for (int k = 0; k < K; k++) {
						if(cross[i][j+k]!=1) {
							con_j=0;
							break;
						}
					}
					if(cross[i][j-1]==0&&cross[i][j+K]==0&&con_j==1)ans++;					
				}
			}
			for (int i = 1; i <= N-K+1; i++) {
				for (int j = 1; j <= N-K+1; j++) {
					int con_i=1;
					for (int k = 0; k < K; k++) {
						if(cross[j+k][i]!=1) {
							con_i=0;
							break;
						}
					}
					if(cross[j-1][i]==0&&cross[j+K][j]==0&&con_i==1)ans++;					
				}
			}
			System.out.println("#"+tc+" "+ans);
		}
	}
}
