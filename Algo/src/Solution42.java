import java.util.Scanner;

public class Solution42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] map = new int[N+1][N+1];
			int st_r = sc.nextInt();
			int st_c = sc.nextInt();
			int j_r,j_c;
			int J = sc.nextInt();
			for(int i=0;i<=N;i++) {
				for(int j=0;j<=N;j++)
					map[i][j]=0;
			}
			for (int i = 0; i < J; i++) {
				j_r=sc.nextInt();
				j_c=sc.nextInt();
				map[j_r][j_c]=1;
			}
			int command = sc.nextInt();
			int dir,num;
			for (int i = 0; i < command; i++) {
				dir=sc.nextInt();
				num=sc.nextInt();
				if(dir==1) 
					st_r-=num;
				else if(dir==2) 
					st_c+=num;
				else if(dir==3) 
					st_r+=num;
				else if(dir==4) 
					st_c-=num;
				if(st_r>=N||st_c>=N||st_r<0||st_c<0||map[st_r][st_c]==1) {
					st_r=0;
					st_c=0;
					for(int j=i+1;j<command;j++) {
						dir=sc.nextInt();
						num=sc.nextInt();
					}
					break;
				}
			
			}
			System.out.println("#"+tc+" "+st_r+" "+st_c);
		}
	}
}
