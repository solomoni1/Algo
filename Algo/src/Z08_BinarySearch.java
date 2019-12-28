
public class Z08_BinarySearch {
	public static void binarySearch(int[] m,int key, int l, int r) {
		if(l>r) {
			System.out.println("못찾음");
		} else {
			int mid = (l+1)/2;
			if(key==m[mid]) {
				System.out.println("찾음" + mid);
			} else if(key < m[mid]) {
				binarySearch(m, key, l, mid-1);
			} else {
				binarySearch(m, key, mid+1, r);
			}
		}
	}
	public static void main(String[] args) {
		int[] m = {0,1,2,3,4,5,6,7,8,9};
		int key = 6;
		binarySearch(m, key, 0, 9);
		

//		int l = 0;
//		int r = m.length-1;
//		while(l<=r) {
//			int mid = (l+r)/2;
//			if(key == m[mid]) {
//				System.out.println("찾음 "+mid);
//				break;
//			} else if(key <m[mid]) {
//				r = mid-1;
//			} else
//				l = mid+1;
//		}
	}
}
