import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_전광판 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		boolean dir = W>0?true:false;
		W = W>0?W:-W;
		String[][] led = new String[N][N];
		for (int i = 0; i < N; i++) {
			s = br.readLine();
			st = new StringTokenizer(s, " ");
			for (int j = 0; j < N; j++) {
				led[i][j] = st.nextToken();
			}
		}
		for (int i = 0; i < led.length/2; i++) {
			for (int j = 0; j < W%(4*(N-1-2*i)); j++) {
				rotate(led,dir,i);
			}
			dir = !dir;
		}
		String answer = "";
		for (int i = 0; i < led.length; i++) {
			for (int j = 0; j < led.length; j++) {
				answer += led[i][j] + ' ';
			}
			answer = answer.substring(0,answer.length()-1);
			answer += '\n';
		}
		System.out.println(answer);
	}
	public static void rotate(String[][] led, boolean clock, int n) {
		if(clock) {
			String temp = led[n][n];
			for (int j = n; j < led.length-n-1; j++) {
				led[j][n] = led[j+1][n];
			}
			for (int j = n; j < led.length-n-1; j++) {
				led[led.length-n-1][j] = led[led.length-n-1][j+1];
			}
			for (int j = n; j < led.length-n-1; j++) {
				led[led.length-j-1][led.length-n-1] = led[led.length-j-2][led.length-n-1];
			}
			for (int j = n; j < led.length-n-2; j++) {
				led[n][led.length-j-1] = led[n][led.length-j-2];
			}
			led[n][n+1] = temp;
		} else {
			String temp = led[n][n];
			for (int j = n; j < led.length-n-1; j++) {
				led[n][j] = led[n][j+1];
			}
			for (int j = n; j < led.length-n-1; j++) {
				led[j][led.length-n-1] = led[j+1][led.length-n-1];
			}
			for (int j = n; j < led.length-n-1; j++) {
				led[led.length-n-1][led.length-j-1] = led[led.length-n-1][led.length-j-2];
			}
			for (int j = n; j < led.length-n-2; j++) {
				led[led.length-j-1][n] = led[led.length-j-2][n];
			}
			led[n+1][n] = temp;
		}
	}
}
