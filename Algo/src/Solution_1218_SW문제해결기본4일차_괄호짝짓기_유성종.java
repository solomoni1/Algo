import java.util.Scanner;

public class Solution_1218_SW문제해결기본4일차_괄호짝짓기_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 1; tc++) {
			int N = Integer.parseInt(sc.nextLine());
			char[] stack = new char [100];
			int top = -1;
			String s = sc.nextLine();
			int ans=1;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='<')
					stack[++top]=s.charAt(i);
				else if(s.charAt(i)==')'&&stack[top]!='(') {
					ans=0;
					break;
				}
				else if(s.charAt(i)=='}'&&stack[top]!='{') {
					ans=0;
					break;
				}
				else if(s.charAt(i)==']'&&stack[top]!='[') {
					ans=0;
					break;
				}
				else if(s.charAt(i)=='>'&&stack[top]!='<') {
					ans=0;
					break;
				}
				else
					top--;
			}
			System.out.println("#"+tc+" "+ans);
		}
	}//end of main
}// end of class
