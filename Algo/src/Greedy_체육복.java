
public class Greedy_체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] num = new int[n+2];
		for (int i = 1; i <= n; i++) {
			num[i]++;
		}
		for (int i = 0; i < lost.length; i++) {
			num[lost[i]]--;
		}
		for (int i = 0; i < reserve.length; i++) {
			num[reserve[i]]++;
		}
		for (int i = 1; i <= n; i++) {
			if(num[i] == 0) {
				if(num[i-1] == 2) {
					num[i] = 1;
					num[i-1] = 1;
				} else if(num[i+1] == 2) {
					num[i] = 1;
					num[i+1] = 1;
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			if(num[i] >= 1) {
				answer++;
			}
		}
        return answer;
	}
	public static void main(String[] args) {
		Greedy_체육복 s = new Greedy_체육복();
		System.out.println(s.solution(5, new int[]{2, 4}, new int[] {1, 3, 5}));
		System.out.println(s.solution(5, new int[]{2, 4}, new int[] {3}));
		System.out.println(s.solution(3, new int[]{3}, new int[] {1}));
	}
}
