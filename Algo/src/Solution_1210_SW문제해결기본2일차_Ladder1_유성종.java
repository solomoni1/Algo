import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1210_SW문제해결기본2일차_Ladder1_유성종 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int tc = 1; tc <= 10; tc++) {
            int T = Integer.parseInt(br.readLine());
			int[][] rad= new int[100][100];
			int r=99;
			int c=99;
			int dir=1;//1:up, 2:left, 3:right
			for (int i = 0; i < rad.length; i++) {
				String s = br.readLine();
				StringTokenizer st = new StringTokenizer(s, " ");
				int j = 0;
				while(st.hasMoreTokens()) {
					rad[i][j]=Integer.parseInt(st.nextToken());
					if(rad[i][j]==2) {
						r=i;
						c=j;
					}
					j++;
				}
			}
			while(r>0) {
				if(dir==1) {
					r--;
					if(c<99&&rad[r][c+1]==1)
						dir=3;
					else if(c>0&&rad[r][c-1]==1)
						dir=2;
				} else if(dir==2) {
					c--;
					if(r>0&&rad[r-1][c]==1)
						dir=1;
				} else {
					c++;
					if(r>0&&rad[r-1][c]==1)
						dir=1;
				}
			}
			System.out.println("#"+T+" "+c);
		}
		
	}
}
