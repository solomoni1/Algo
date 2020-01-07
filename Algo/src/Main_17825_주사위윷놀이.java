import java.util.Scanner;

public class Main_17825_주사위윷놀이 {
	public static class Dice{
		int loc = 0;
		boolean isBlue = false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = new int[10];
		int[] red = new int[22];
		int[] blue = new int[23];
		for (int i = 0; i < dice.length; i++) {
			dice[i] = sc.nextInt();
		}
		for (int i = 0; i < red.length; i++) {
			red[i] = 2 * i;
		}
		blue[6] = 13; blue[7] = 16 ;blue[8] = 19;
		blue[11] = 22; blue[12] = 24;
		blue[16] = 28; blue[17] = 27; blue[18] = 26;
		blue[19] = 25; blue[20] = 30; blue[21] = 35;
		
	}
}
