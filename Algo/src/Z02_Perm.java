import java.util.Arrays;
import java.util.Scanner;

public class Z02_Perm {
	public static void Perm(int cnt) {
		
	}
	public static void main(String[] args) {
		int[] arr = {4,7,9};
		int[] card = new int[6];
		Scanner sc = new Scanner(System.in);
//		String a=sc.nextLine();
//		for (int i = 0; i < a.length(); i++) {
//			card[i]=Character.getNumericValue(a.charAt(i));
//		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) continue;
				for (int k = 0; k < 3; k++) {
					if (i == k || j == k) continue;
					System.out.println(arr[i] + ","+arr[j]+","+arr[k]);
				}
			}
		}
		
		
	}
}
