import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2750_수정렬하기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if(max < num[i]) max = num[i];
		}
//		Arrays.parallelSort(num);
		quickSort(num, 0, N - 1);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public static void quickSort(int[] num, int begin, int end) {
		int p = partition(num, begin, end);
		if(p > begin) quickSort(num, begin, p - 1);
		if(p < end) quickSort(num, p + 1, end);
	}

	public static int partition(int[] num, int begin, int end) {
		int pivot = (begin + end) / 2;
		int L = begin;
		int R = end;
		while(L < R) {
			while(num[L] < num[pivot] && L < R) {
				L++;
			}
			while(num[R] >= num[pivot] && L < R) {
				R--;
			}
			if(L < R) {
				int temp = num[L];
				num[L] = num[R];
				num[R] = temp;
			}
		}
		int temp = num[pivot];
		num[pivot] = num[R];
		num[R] = temp;
		return R;
	}
	
}
