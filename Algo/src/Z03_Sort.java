import java.util.Arrays;

/**
 * 정렬
 * 카운팅 정렬	O(N)		// 가장 빠른 정렬 방법 : 제약사항, 정렬할 데이터가 정수(0 이상의 정수)
 * 
 *  퀵정렬 	O(NlogN)	//구현하기 어렵다, 시간이 중간정도 빠르다
 *  병합정렬	O(NlogN)	
 *  힙정렬	O(NlogN)	
 *  
 *  거품정렬	O(N^2)		// 구현하기 쉽다, 상대적으로 시간이 많이 걸린다
 *  선택정렬	O(N^2)		
 *  삽입정렬	O(N^2)		
 *
 */
public class Z03_Sort {
	public static void main(String[] args) {
		// 거품 정렬
//		int[] a = {5,3,7,1,9,2,8,6,4};
//		for (int i = a.length-1; i >= 0; i--) {
//			for (int j = 0; j < i; j++) {
//				if (a[j] > a[j+1]) {
//					int temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//			System.out.println("i: "+i+","+Arrays.toString(a));
//		}
//		System.out.println(Arrays.toString(a));
//		두 개씩 비교해서 큰 값을 뒤로
		//카운팅 정렬
		int[] b = {2,3,1,0,2,2,1,1,1,2,3,2};
		//카운팅 정렬할 데이터의 최대값을 미리 알아야 한다. (최소값도 알며 메모리를 절약할 수 있다)
//		1이 몇번 사용되었는가?
		int[] cnt = new int[4];
		for (int i = 0; i < b.length; i++) {
			cnt[b[i]]++;
		}
		System.out.println(Arrays.toString(cnt));
		
		//오름차순으로 출력하기
		for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < cnt[i]; j++) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		
		//최빈수 출력
		int maxIndex = 0; // 최대값을 지닌 방번호
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[maxIndex] < cnt[i]) maxIndex = i;
		}
		System.out.println(maxIndex);
		
		
		
		
	} // end of main
} // end of class
