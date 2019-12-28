import java.util.Scanner;

public class Solution_마이쮸_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] q = new int[400];
		int front = -1, rear = -1;
		int mychu = 20;
		int[] ppl = {1,1,1,1,1,1,1,1,1,1,1,1,1};
		int i = 1;
		q[++rear] = i;
		int cur_mychu=mychu;
		while(cur_mychu>0) {
			cur_mychu-= ppl[q[++front]]++;
			q[++rear]=q[front];
			q[++rear]=++i;
			System.out.println("큐에 있는 사람 수:"+(rear-front));
			System.out.println("현재 1인당 나눠주는 사탕의 수: "+ppl[q[front+1]]);
			if(cur_mychu>0)
				System.out.println("현재까지 나눠준 사탕 수: "+(mychu-cur_mychu));
			else
				System.out.println("현재까지 나눠준 사탕 수: "+mychu);
		}
		System.out.println("마지막 사탕 가져간 사람: "+q[front]);
	}
}
