
public class Z12_String {
	public static void main(String[] args) {
		String s = "algorithm";
		String target=new String();
		for (int i = 0 ;i<s.length();i++) {
			target=target.concat(s.substring(s.length()-i-1,s.length()-i));
		}
		System.out.println(target);
		System.out.println(s);
	}
}
