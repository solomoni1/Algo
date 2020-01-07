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
		quickSort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public static void quickSort(int[] num) {
		
	}
	
}
