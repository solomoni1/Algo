import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z20_Cal2 {
	public static void main(String[] args) throws IOException {
		char[] stackOp = new char[100];
		int top = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			if(s.equals("(")) {
				stackOp[++top] = s.charAt(0);
			} else if(s.equals("*")||s.equals("/")) {
				while(top>-1&&(stackOp[top]=='*'||stackOp[top]=='/')) {
					System.out.print(stackOp[top--]+" ");
				}
				stackOp[++top] = s.charAt(0);
			} else if(s.equals("+")||s.equals("-")) {
				if(top>-1&&stackOp[top] == '(') {
					stackOp[++top] = s.charAt(0);
				}
				else {
					while(top>-1&&stackOp[top] != '(') {
						System.out.print(stackOp[top--]+" ");
					}
					stackOp[++top] = s.charAt(0);
				}
			} else if(s.equals(")")) {
				while(top>-1&&stackOp[top]!='(') {
					System.out.print(stackOp[top--]+" ");
				}
				if(top>-1)
					top--;
			} else
				System.out.print(s+" ");
		}
		while(top>-1) {
			System.out.print(stackOp[top--]+" ");
		}
	}
}
