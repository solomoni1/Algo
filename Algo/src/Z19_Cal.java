import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Z19_Cal {
	public static void main(String[] args) throws IOException {
		int[] stack = new int[100];
		int top = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		stack[++top]= Integer.parseInt(st.nextToken());//첫번째 피연산자를 숫자로 변환해서 스택에 저장
		while(st.hasMoreTokens()) {
			char op = st.nextToken().charAt(0);//연산자
			int num = Integer.parseInt(st.nextToken());//피연산자
			if(op == '+') {
				stack[++top]=num;
			} else {
				int pre = stack[top];
				stack[top]=pre*num;
			}
		}
		int sum = 0;
		for (int i = 0; i <= top; i++) {
			sum+=stack[i];
		}
		System.out.println(sum);
		
//		String[] input = {"12","+","5","*","2","+","3","+","4","*","2"};
//		for (int i = 0; i < input.length; i++) {
//			if(input[i]=="+") {
//				stack[++top]=input[i];
//			} else if(input[i]=="*") {
//				stack[top]=Integer.toString(Integer.parseInt(stack[top])*Integer.parseInt(input[i+1]));
//				i++;
//			} else {
//				stack[++top]=input[i];
//			}
//		}
//		int sum= 0;
//		for (int i = 0; i <= top; i++) {
//			if(stack[i]!="+") {
//				sum+=Integer.parseInt(stack[i]);
//			}
//		}
//		System.out.println(sum);
	}
}
