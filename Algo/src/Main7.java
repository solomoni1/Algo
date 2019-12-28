import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[10];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
			if (list[i] < 100 && max < list[i]) 
				max = list[i];
			if (list[i] >= 100 && min > list[i])
				min = list[i];
		}
		if (min > 10000)
			min = 100;
		if (max < 0)
			max = 100;
		System.out.println(max + " " + min);
	}
}
