import java.util.Scanner;

public class Solution_5432_쇠막대기자르기_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 1; tc <= T; tc++) {
			String s = sc.nextLine();
			int ans=0;
			int top=1;
			for (int i = 1; i < s.length(); i++) {
				if(s.charAt(i)=='(')
					++top;
				else if(s.charAt(i)==')'&&s.charAt(i-1)=='(')
					ans+=(--top);
				else{
					ans++;
					top--;
				}
			}
			System.out.println("#"+ tc + " "+ans);
		}
	}
}
