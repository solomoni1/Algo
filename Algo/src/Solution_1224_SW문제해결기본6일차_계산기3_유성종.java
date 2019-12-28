import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1224_SW문제해결기본6일차_계산기3_유성종 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int tc = 1; tc<=10;tc++) {
			int T = Integer.parseInt(br.readLine());
			String str = br.readLine();
			int[] stack = new int[1000];
			char[] stackOp = new char[1000];
			String[] input = new String[1000];
			int num = 0;
			int top = -1;
			for(int i = 0; i < T;i++) {
				char c = str.charAt(i);
				if(c=='(') {
					stackOp[++top] = c;
				} else if(c=='*'||c=='/') {
					while(top>-1&&(stackOp[top]=='*'||stackOp[top]=='/')) {
						input[num++]=stackOp[top--]+"";
					}
					stackOp[++top] = c;
				} else if(c=='+'||c=='-') {
					if(top>-1&&stackOp[top] == '(') {
						stackOp[++top] = c;
					}
					else {
						while(top>-1&&stackOp[top] != '(') {
							input[num++]=stackOp[top--]+"";
						}
						stackOp[++top] = c;
					}
				} else if(c==')') {
					while(top>-1&&stackOp[top]!='(') {
						input[num++]=stackOp[top--]+"";
					}
					if(top>-1)
						top--;
				} else
					input[num++]=c+"";
			}
			while(top>-1) {
				input[num++]=stackOp[top--]+"";
			}
			for (int i = 0; i < num; i++) {
				char c = input[i].charAt(0);
				int a,b;
				switch (c) {
				case '*':
					a = stack[top--];
					b = stack[top];
					stack[top]=b*a;
					break;
				case '/':
					a = stack[top--];
					b = stack[top];
					stack[top]=b/a;
					break;
				case '+':
					a = stack[top--];
					b = stack[top];
					stack[top]=b+a;
					break;
				case '-':
					a = stack[top--];
					b = stack[top];
					stack[top]=b-a;
					break;
	
				default:
					stack[++top]=Integer.parseInt(input[i]);
					break;
				}
			}
			System.out.println("#"+tc+" "+stack[top]);
		}
	}
}
