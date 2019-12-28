import java.util.Scanner;

public class Solution_1928_Base64Decoder_유성종 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 1; tc <= T; tc++) {
			String s = sc.nextLine();
			int i=0;
			char[] c = new char[s.length()/4];
			while(i<s.length()) {
				String ans=new String();
				for(int j = i;j < i+4;j++) {
					int a;
					if(s.charAt(j)<='Z')
						a = s.charAt(j)-'A';
					else if(s.charAt(j)<='z')
						a = s.charAt(j)-'a'+26;
					else if(s.charAt(j)<='9')
						a = s.charAt(j)-'0'+52;
					else if(s.charAt(j)=='+')
						a = s.charAt(j)-'+'+62;
					else
						a = s.charAt(j)-'/'+63;
					String temp = Integer.toBinaryString(a);
					for (int k = 0; k < 6-temp.length(); k++) {
						ans=ans.concat("0");
					}
					ans=ans.concat(temp);
				}
				System.out.println(ans);
				for(int j = 0;j<s.length();j+=8) {
					for (int k = j; k <j+8 ; k++) {
						
					}
				}
				i+=4;
			}
		}
	}
}
