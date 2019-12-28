import java.util.Scanner;

public class Solution2 {
	static int N;
	static int L;
	static int[] score = new int[21];
	static int[] cal = new int[21];
	static int max=0;
	static int calory=0;
	static int cur_max=0;
	public static void Greedy(int cnt) {
		calory+=cal[cnt];
		cur_max+=score[cnt];
		if(calory>L) {
			calory-=cal[cnt];
			cur_max-=score[cnt];
			return;
		}
		else if(calory == L) {
			if(max<cur_max)
				max=cur_max;
			calory-=cal[cnt];
			cur_max-=score[cnt];
			return;
		}
        if(max<cur_max)
			max=cur_max;
		for(int i=cnt+1;i<N;i++) {
			Greedy(i);
		}
		calory-=cal[cnt];
		cur_max-=score[cnt];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			L = sc.nextInt();
			for (int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
				cal[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				Greedy(i);
			}
			System.out.println("#"+tc+" "+max);
		}
	}
}
