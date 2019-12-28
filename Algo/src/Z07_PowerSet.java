/**
 * PowerSet : 어떠한 집합의 모든 부분집합을 원소로 하는 집합
 * 반복문, 바이너리카운팅, 재귀
 *
 */
public class Z07_PowerSet {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,-1,-2,-3,-4};
		for (int i = 0; i < (1<<arr.length); i++) {
			int sum = 0;
			int[] temp = new int[arr.length];
			int size = 0;
			for (int j = 0; j < arr.length; j++) {
				if((i & 1<<j) != 0) {
					sum+=arr[j];
					temp[size++]=arr[j];
				}
			}
			if(sum==0) {
				for (int j = 0; j < size; j++) {
					System.out.print(temp[j]+" ");
				}
				System.out.println();
			}
		}
//		int[] arr = {5,2,8,3};
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				for (int k = 0; k < 2; k++) {
//					for (int m = 0; m < 2; m++) {
//						if(i==1) System.out.print(arr[0]+" ");
//						if(j==1) System.out.print(arr[1]+" ");
//						if(k==1) System.out.print(arr[2]+" ");
//						if(m==1) System.out.print(arr[3]+" ");
//						
//					}
//				}
//			}
//		}
	}
}
