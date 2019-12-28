import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[10];
		int sum = 0;
		int mean = 0;
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
			if (i % 2 == 0) //odd
				mean += list[i];
			else //even
				sum += list[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + Math.round(mean/5.0*10.0) / 10.0);
	}
}
