
public class Greedy_큰수만들기 {
	public String solution(String number, int k) {
		StringBuilder sb = new StringBuilder(number);
		int left = k;
		int s = 0;
		while(left > 0) {
			int comp = sb.charAt(s) - '0';
			boolean check = false;
			for (int i = s + 1; i <= s + left; i++) {
				int curNum = sb.charAt(i) - '0';
				if(comp < curNum) {
					sb.replace(s, i, "");
					left -= i - s;
					check = true;
					break;
				} else if(comp == 9 && comp == curNum) {
					sb.replace(s+1, i, "");
					left -= i - ++s;
					check = true;
					break;
				}
			}
			if(!check) {
				if(s + left + 1 == sb.length()) {
					sb.replace(s+ 1, s + left + 1, "");
					left = 0;					
				} else {
					s++;
				}
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Greedy_큰수만들기 s = new Greedy_큰수만들기();
//		System.out.println(s.solution("1924", 2));
//		System.out.println(s.solution("1231234", 3));
//		System.out.println(s.solution("4177252841", 1));
//		System.out.println(s.solution("4177252841", 2));
//		System.out.println(s.solution("4177252841", 3));
//		System.out.println(s.solution("4177252841", 4));
//		System.out.println(s.solution("4177252841", 5));
//		System.out.println(s.solution("4177252841", 6));
		System.out.println(s.solution("4177252841", 7));
		System.out.println(s.solution("4177252841", 8));
		System.out.println(s.solution("4177252841", 9));
		System.out.println(s.solution("123456", 3));
		System.out.println(s.solution("654321", 3));
		System.out.println(s.solution("654325", 3));
	}
}
