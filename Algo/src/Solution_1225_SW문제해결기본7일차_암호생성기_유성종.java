import java.util.Scanner;

public class Solution_1225_SW문제해결기본7일차_암호생성기_유성종{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 0; tc < 10; tc++) {
			int T = sc.nextInt();
			int[] pw = new int[15];
			int front = -1, rear = -1;
			for (int i = 0; i < 8; i++) {
				pw[++rear] = sc.nextInt();
			}
			int num = 0;
			while(pw[rear]>0) {
				for (int i = 1; i <= 5; i++) {
					pw[++rear]=pw[++front]-i;
                    if(pw[rear]<=0){
                        pw[rear]=0;
                        break;
                    }
				}
				for (int i = 0; i < 8; i++) {
					pw[i] = pw[i+front+1];
				}
				front = -1;
				rear = 7;
			}
            System.out.print("#"+T+" ");
            for(int i = 0; i<8;i++)
                System.out.print(pw[i]+" ");
            System.out.println();
		}
	}
}
