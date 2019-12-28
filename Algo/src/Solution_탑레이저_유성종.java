import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_탑레이저_유성종 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String[] str = s.split(" ");
		StringBuilder sb = new StringBuilder();
		int[] ans = new int[500000];
		int[] tower = new int[500000];
		for (int i = 0; i < N; i++) {
			tower[i] = Integer.parseInt(str[i]);
		}
		int top = 0;
		int[] stack = new int[500000];
		stack[top] = N;
		for (int i = N - 1; i >= 0; i--) {
			while(top>-1&&tower[i]>=tower[stack[top]]) {
				ans[stack[top--]]=i+1;
			}
			stack[++top]=i;
		}
		for (int i = 0; i < N; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
