import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8383_숫자선물 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			String N = s.substring(0, s.length() - 4);
			int len = N.length();
			char x = s.charAt(len + 1);
			char y = s.charAt(len + 3);
			char big = x > y ? x : y;
			char small = x < y ? x : y;
			int bigInd = -1;
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < len; i++) {
				char cur = N.charAt(i);
				if(cur > big) {
					for (int j = i; j < len; j++) {
						result.append(big);
					}
					break;
				} else if(cur == big) {
					if(i == len - 1) {
						result.append(big);
						break;
					}
					char next = N.charAt(i+1);
					if(next >= small) {
						bigInd = i;
						result.append(big);
					} else {
						result.append(small);
						for (int j = i + 1; j < len; j++) {
							result.append(big);
						}
						break;
					}
				} else if(big > cur && cur > small) {
					if(i != 0 || small != '0') {
						result.append(small);
					}
					for (int j = i + 1; j < len; j++) {
						result.append(big);
					}
					break;
				} else if(cur == small) {
					if(i == len - 1) {
						result.append(small);
						break;
					}
					char next = N.charAt(i+1);
					if(next >= small) {
						result.append(small);
					} else {
						if(bigInd >= 0) {
							result.replace(bigInd, bigInd + 1, small + "");
							for (int j = bigInd + 1; j < len; j++) {
								result.replace(j, j + 1, "" + big);
							}
							break;
						} else if(bigInd < 0 && len > 1) {
							result = new StringBuilder();
							for (int j = 0; j < len - 1; j++) {
								result.append(big);
							}
							break;
						}
						result = new StringBuilder("-1");
						break;
					}
				} else {// cur < small
					if(bigInd >= 0) {
						result.replace(bigInd, bigInd + 1, small + "");
						for (int j = bigInd + 1; j < len; j++) {
							result.replace(j, j + 1, "" + big);
						}
						break;
					} else if(bigInd < 0 && len > 1) {
						result = new StringBuilder();
						for (int j = 0; j < len - 1; j++) {
							result.append(big);
						}
						break;
					}
					result = new StringBuilder("-1");
					break;
				}
			}
			if(result.toString().equals("")) {
				result = new StringBuilder("-1");
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
