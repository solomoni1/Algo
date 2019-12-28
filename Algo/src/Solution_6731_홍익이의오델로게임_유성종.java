import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_6731_홍익이의오델로게임_유성종 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int n=0;
			int[][] map = new int[N][N];
			int[] r = new int[N];
			int[] c = new int[N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {					
					map[i][j]=br.read();
					if(map[i][j]==66) {
						r[i]++;
						c[j]++;
					}
				}
				br.read();
				br.read();
			}
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					if(map[i].charAt(j)=='B') {
//						r[i]++;
//						c[j]++;
//					}
//				}
//			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j]==66&&(r[i]+c[j]-1)%2==1) {
						n++;
					} else if(map[i][j]!=66&&(r[i]+c[j])%2==1){
						n++;
					}
				}
			}
			System.out.println("#"+tc+" "+n);
		}
	}
}
