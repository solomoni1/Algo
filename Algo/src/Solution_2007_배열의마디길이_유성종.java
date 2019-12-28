import java.util.Scanner;

public class Solution_2007_배열의마디길이_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 1; tc <= T; tc++) {
			int num=0;
			String s = sc.nextLine();
			for (int i = 1; i <= s.length()/2; i++) {
				if(s.substring(0, i).equals(s.substring(i,2*i)))
				{					
					num=s.substring(0,i).length();
					break;
				}
			}
			System.out.println("#"+tc+" "+num);
		}
	}
}
