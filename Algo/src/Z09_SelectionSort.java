import java.util.Arrays;

public class Z09_SelectionSort {
	public static void main(String[] args) {
		int[][] arr = {{9,20,2,18,11},{19,1,25,3,21},{8,24,10,17,7},{15,4,16,5,6},{12,13,22,23,14}};
		int[] m = new int[25];
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				m[index++] = arr[i][j];
			}
		}
		for (int i = 0; i < m.length-1; i++) {
			int min=i;
			for (int j = i; j < m.length; j++) {
				if(m[min]>m[j])
					min=j;
			}
			int temp=m[min];
			m[min]=m[i];
			m[i]=temp;
		}
		int n=5;
		int[][]	result = new int[5][5];
		int x=0;
		int y=-1;
		int d=1;
		index=0;
		while(n>0) {
			for (int i = 0; i < n; i++) {
				y+=d;
				result[x][y]=m[index++];
			}
			n--;
			for (int i = 0; i < n; i++) {
				x+=d;
				result[x][y]=m[index++];
			}
			d=-d;
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%2d ",result[i][j]);
			}
			System.out.println();
		}
	}
}
