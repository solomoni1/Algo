/**
 * 교재 gravity 문제
 * @author student
 *
 */
public class Z01_Gravity {
	public static void main(String[] args) {
		int[] data = {7 ,4 ,2, 0, 0, 6 ,0 ,7 ,0};
		int[][] box = new int[8][9];
		int[][] nbox = new int[9][8];
//		int[] data = new int[100];
		int cnt;
		int max=0;
		for (int i = 0; i < data.length; i++) {
			if(data[i]==0) continue;
			cnt=0;
			for (int j = i+1; j < data.length; j++) {
				if (data[i]<=data[j])
					cnt++;
			}
			if(data.length-i-cnt-1>max)
				max=data.length-i-1-cnt;
		}
		System.out.println(max);
	}
}
