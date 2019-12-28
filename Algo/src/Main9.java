import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		for (int i = 0; i < list.length-1; i++) {
			int min = i;
			for (int j = i; j < list.length; j++) {
				if (list[min] > list[j])
					min = j;
			}
			int temp = list[i];
			list[i] = list[min];
			list[min] = temp;
		}
		for (int i = list.length-1; i >= 0; i--) {
			System.out.print(list[i] + " ");
		}
	}
}
