import java.util.Arrays;

/**
 * 재귀 함수 : 함수 내에서 자기 자신을 다시 호출하는 함수
 * 
 *
 */
public class Z04_Re {
//	public static int cnt=0;
	public static void a(int cnt) {
		if(cnt==4) {//종료조건
			System.out.println();
			return;
		}
			
		System.out.print(cnt+" ");
		a(cnt+1);
	}
	public static void b(int cnt, int end) {
		if(cnt >= end) {
			System.out.println();
		}
		else {
			System.out.print(cnt + " ");
			b(cnt+1,end);
		}
	}
	public static void c(int cnt, int end, int interval) {
		if(cnt >= end) {
			System.out.println();
		}
		else {
			System.out.print(cnt + " ");
			c(cnt+interval, end, interval);
		}
	}
//	static int sum;
	
	public static void d(int cnt, int end,int sum) {
		if(cnt > end) {
			System.out.println(sum);
		}
		else {
			d(cnt+1,end, sum+cnt);
		}
	}
	public static int e(int cnt, int end) {
		if(cnt >= end) {
			return end;
		}
		else {
			return e(cnt+1, end)+cnt;
		}
	}
	public static int f(int num) {
		if(num<1) {
			return num;
		}
		else {
			return num%10 + f(num/10);
		}
	}
	public static void g(int n, int[] arr) {
		if (n >= arr.length) {
			System.out.println(Arrays.toString(arr));
		} else {
			arr[n]=0;
			g(n+1,arr);
			arr[n]=1;
			g(n+1,arr);
		}
	}
	public static void h(int n, int[] arr) {
		if (n >= arr.length) {
			System.out.println(Arrays.toString(arr));
		} else {
			arr[n]=0;
			h(n+1,arr);
			arr[n]=1;
			h(n+1,arr);
			arr[n]=2;
			h(n+1,arr);
		}
	}
	public static void k(int n, int[] arr) {
		if (n >= arr.length) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(www[arr[i]] +" ");
			}
			System.out.println();
		}
		else {
			boolean[] check = new boolean[arr.length];//사용한 숫자 체크
			for (int i = 0; i < n; i++) {
				check[arr[i]] = true;
			}
			for (int i = 0; i < check.length; i++) {
				if (!check[i]) {
					arr[n] = i;
					k(n+1,arr);
				}
			}
		}
	}
	static int[] www = {4,6,8,9};
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		a(0);
		b(0,5);
		c(0, 10, 2);
		d(1,10,0);
		System.out.println(e(1,10));
		int num=1234;
		System.out.println(f(num));
//		3자리 이진수로 만들수 있는 모든 경우의 수를 출력
		g(0,new int[3]);
//		5자리 삼진수
		h(0,new int[5]);
		System.out.println("=========순열 출력하는 재귀함수========");
		k(0,new int[4]);
	}
}
