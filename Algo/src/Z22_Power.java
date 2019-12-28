
public class Z22_Power {
	public static long power(int base, int exp) {
		if(exp==0) {
			return (long)1;
		} else if (exp==1) {
			return (long)base;
		} else if(exp %2 == 0) {
			long n = power(base, exp / 2);
			return n * n;
		} else {
			long n = power(base, (exp - 1) / 2);
			return n * n * base;
		}
	}
	public static void main(String[] args) {
		
		System.out.println(power(2,62));
	}// end of main
}// end of class
