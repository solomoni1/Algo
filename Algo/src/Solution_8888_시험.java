import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8888_시험 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Test = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= Test; tc++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int N = Integer.parseInt(st.nextToken());
			int T = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int[][] students = new int[N+1][T];
			int[] totalScore = new int[N+1];
			int[] totalAns = new int[N+1];
			int[] scores = new int[T];
			for (int i = 1; i <= N; i++) {
				s = br.readLine();
				st = new StringTokenizer(s, " ");
				for (int j = 0; j < T; j++) {
					students[i][j] = Integer.parseInt(st.nextToken());
					if(students[i][j] == 0) {
						scores[j]++;
					}
				}
			}
			for (int i = 1; i <= N; i++) {
				for (int j = 0; j < T; j++) {
					if(students[i][j] == 1) {
						totalScore[i] += scores[j];
						totalAns[i]++;
					}
				}
			}
			int myScore = totalScore[P];
			int myAns = totalAns[P];
			int myRank = 1;
			for (int i = 1; i <= N; i++) {
				if(i == P) continue;
				if(myScore < totalScore[i]) myRank++;
				else if(myScore == totalScore[i] && totalAns[i] > myAns) myRank++;
				else if(myScore == totalScore[i] && totalAns[i] == myAns && i < P) myRank++;
			}
			System.out.println("#" + tc + " " + myScore + " " + myRank);
		}
	}
}
