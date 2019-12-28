import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z21_Cal3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] stack = new int[1000];
		char[] stackOp = new char[1000];
		String[] input = new String[1000];
		int num = 0;
		int top = -1;
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			if(s.equals("(")) {
				stackOp[++top] = s.charAt(0);
			} else if(s.equals("*")||s.equals("/")) {
				while(top>-1&&(stackOp[top]=='*'||stackOp[top]=='/')) {
					input[num++]=stackOp[top--]+"";
				}
				stackOp[++top] = s.charAt(0);
			} else if(s.equals("+")||s.equals("-")) {
				if(top>-1&&stackOp[top] == '(') {
					stackOp[++top] = s.charAt(0);
				}
				else {
					while(top>-1&&stackOp[top] != '(') {
						input[num++]=stackOp[top--]+"";
					}
					stackOp[++top] = s.charAt(0);
				}
			} else if(s.equals(")")) {
				while(top>-1&&stackOp[top]!='(') {
					input[num++]=stackOp[top--]+"";
				}
				if(top>-1)
					top--;
			} else
				input[num++]=s;
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
		System.out.println(stack[top]);
	}
}
