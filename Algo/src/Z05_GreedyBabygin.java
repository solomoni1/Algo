import java.util.Arrays;

/**
 * 베이비진 탐욕기법
 * 6개의 숫자카드에서 사용된 숫자를 카운팅
 */
public class Z05_GreedyBabygin {
	public static void main(String[] args) {
		int[] num = {0,1,9,4,7,5};
		int[] cnt = new int[12];
		for (int i = 0; i < num.length; i++) {
			cnt[num[i]]++;
		}
		int i = 0;
		cnt[10]=cnt[0];
		cnt[11]=cnt[1];
		int check = 0;
		while(i < 10)	{//0~9
			//run 인지 확인, cnt 배열의 각 값이 3이상이면
			if (cnt[i] >= 3) {//triplet
				System.out.println("트리플렛");
				check++;
				cnt[i] -= 3;
				continue;
			}
			if (cnt[i] >= 1 && cnt[i+1] >= 1 && cnt[i+2] >= 1) {//run
				System.out.println("런");
				cnt[i]--;cnt[i+1]--;cnt[i+2]--;
				check++;
			}
			i++;
		}
		if(check == 2)System.out.println("베이비진");
		else System.out.println("베이비진 아님");
	} // end of main
} // end of class
