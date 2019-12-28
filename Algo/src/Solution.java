import java.util.Scanner;

public class Solution {
	static int N;
	static int[] arr = new int[1001];
	static int max=0;
	static int cur_max=0;
	public static void Greedy(int cnt) {
		cur_max++;
		if(cnt>0 && arr[cnt]<arr[cnt-1]) {
			cur_max--;
			return;
		}
		if(cur_max>max)
			max=cur_max;
		for(int i=cnt+1;i<N;i++) {
			Greedy(i);
		}
		cur_max--;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				Greedy(i);
			}
			System.out.println("#"+tc+" "+max);
		}
	}
}
