
public class Solution_이진검색_유성종 {
	public static void binarySearch(int key, int[] m,int l,int r) {
		int mid = (l+r)/2;
		if(l>r) {
			System.out.println("binarySearch로 못찾음");
			return;
		} else if(m[mid]==key) {
			System.out.println("binarySearch: "+m[mid]);
			return;
		} else if(m[mid] > key) {
			binarySearch(key,m,l,mid-1);
		} else {
			binarySearch(key,m,mid+1,r);
		}
	}
	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		int key =7;
		int l = 0;
		int r = a.length-1;
		int ans=-1;
		while(l<=r) {
			int mid = (l + r)/2;
			if(a[mid]==key) {
				ans=a[mid];
				break;
			} else if(a[mid]>key) {
				r=mid-1;
			} else {
				l=mid+1;
			}
		}
		if(l>r)
			System.out.println("반복문으로 못찾음");
		else
			System.out.println("while: "+ans);
		binarySearch(key,a,l,r);
	}
}
