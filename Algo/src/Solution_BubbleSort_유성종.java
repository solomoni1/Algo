import java.util.Random;

public class Solution_BubbleSort_유성종 {
	public static void main(String[] args) {
		int[] list = new int[20];
		Random r = new Random();
		for (int i = 0; i < list.length; i++) {
			list[i] = r.nextInt(100);
			System.out.print(list[i] + " ");
		}
		System.out.println();
		for (int i = list.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(list[j]>list[j+1]) {
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
