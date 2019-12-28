import java.util.Scanner;

public class Main_1182_부분수열의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] numbs =new int[N];
		boolean[] on = new boolean[N];
		int answer = 0;
		for (int i = 0; i < numbs.length; i++) {
			numbs[i] = sc.nextInt();
		}
		for (int i = 0; i < numbs.length; i++) {
			for (int j = i; j < numbs.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += numbs[k];
				}
				if(sum==S) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
