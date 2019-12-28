import java.util.Scanner;

public class Main_11399_ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] time = new int[1001];
		int answer = 0;
		for (int i = 0; i < N; i++) {
			time[sc.nextInt()]++;
		}
		for (int i = 1; i <= 1000; i++) {
			if(N==0)break;
			if(time[i]!=0) {
				answer += i*N;
				time[i--]--;
				N--;
			}
		}
		System.out.println(answer);
	}
}
