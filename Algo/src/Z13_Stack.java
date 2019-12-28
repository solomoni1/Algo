import java.util.Stack;

public class Z13_Stack {
	static char[] stack = new char [100];
	static int top = -1;
	public static void main(String[] args) {
		//스택에 값을 넣기
		String s = "()()(){()}[{}]";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
				stack[++top]=s.charAt(i);
			else if(s.charAt(i)==')'&&stack[top]!='(') {
				System.out.println("not good");
				break;
			}
			else if(s.charAt(i)=='}'&&stack[top]!='{') {
				System.out.println("not good");
				break;
			}
			else if(s.charAt(i)==']'&&stack[top]!='[') {
				System.out.println("not good");
				break;
			}
			else if(s.charAt(i)=='>'&&stack[top]!='<') {
				System.out.println("not good");
				break;
			}
			else
				top--;
		}
		if(top==-1)
			System.out.println("good");
	}//end of main
}// end of class
