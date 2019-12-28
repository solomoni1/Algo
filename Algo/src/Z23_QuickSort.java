import java.util.Arrays;

public class Z23_QuickSort {
	public static void quick(int[] a, int begin, int end) {
		int p = partition(a, begin, end);
		if(p>begin)
			quick(a,begin,p-1);
		if(p<end)
			quick(a, p+1, end);
	}
	public static int partition(int[] a, int begin, int end) {
		int pivot = (begin + end) / 2;
		int L = begin;
		int R = end;
		while(L<R) {
			while(a[L]<a[pivot]&&L<R) {
				L = L+1;
			}
			while(a[R]>=a[pivot]&&L<R) {
				R = R-1;
			}
			if(L<R) {
				int temp = a[L];
				a[L] = a[R];
				a[R] = temp;
			}
		}
		int temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		return R;
	}
	public static void main(String[] args) {
		int[] arr = {69, 10, 30, 2, 16, 8, 31 ,22, 80 , 70 , 99 , 100 , 1 , 64};
		quick(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
