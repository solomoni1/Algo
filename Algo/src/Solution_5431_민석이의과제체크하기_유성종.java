
import java.util.Scanner;

public class Solution_5431_민석이의과제체크하기_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			boolean[] student = new boolean[N+1];
			int num;
			for (int i = 1; i <= K; i++) {
				num = sc.nextInt();
				student[num]=true;
			}
			System.out.println("#"+tc+" ");
			for (int i = 1; i < student.length; i++) {
				if (!student[i])
					System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
