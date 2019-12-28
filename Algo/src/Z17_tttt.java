import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Z17_tttt {
	public static void main(String[] args) {
//		List 순서유지, 데이터중복가능
//			ArrayList, LinkedList
//		Set 순서없음, 데이터 중복불가
//			HashSet, TreeSet
//		Map 키:값의 구조로 되어있음
//			HashMap, TreeMap
		
//		Hash 기법을 사용하려면 hashCode(),equals()를 overriding 해야한다.
//		BinarySearchTree 기법을 사용하려면 compareTo, compare() 를 구현해야한다.
		HashSet<Girl> hs = new HashSet<>();
		hs.add(new Girl(26,"SJ"));
		hs.add(new Girl(22,"수지"));
		hs.add(new Girl(26,"SJ"));
		System.out.println(hs);
		
		HashMap<Girl, Integer> hm = new HashMap<>();
		hm.put(new Girl(22,"류현진"), 100);
		hm.put(new Girl(25,"수지"), 100);
		hm.put(new Girl(25,"서민규"), 80);
		hm.put(new Girl(25,"서민규"), 200);
		System.out.println(hm);
		
		TreeSet<Cup> ts = new TreeSet<Cup>();
		ts.add(new Cup(100,"서민규"));
		ts.add(new Cup(120,"서민규"));
		ts.add(new Cup(70,"수지"));
		System.out.println(ts);
		System.out.println("===============================");
		Set<Girl> ks = hm.keySet();
		for (Girl girl : ks) {
			System.out.println(girl);
		}
		Iterator <Girl> iter = ks.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+",");
		}
		System.out.println();
		Set<Entry<Girl, Integer>> es = hm.entrySet();
		for (Entry<Girl, Integer> entry : es) {
			System.out.print(entry+",");
		}
		System.out.println();
		Iterator<Entry<Girl,Integer>> ex = es.iterator();
		while(ex.hasNext()) {
			Entry<Girl, Integer> en = ex.next();
			System.out.print(en+" ");
		}
	}
}
class Cup implements Comparable<Cup>{
	int size;
	String name="";
	public Cup() {
		// TODO Auto-generated constructor stub
	}
	public Cup(int size, String name) {
		this.size = size;
		this.name = name;
	}
	public String toString() {
		return String.format("[%d, %s]", size,name);
	}
	@Override
	public int compareTo(Cup o) {
		
		return this.size - o.size;
	}
	
}
class Girl extends Object {
	int age;
	String name;
	public Girl() {
		// TODO Auto-generated constructor stub
	}
	public Girl(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public boolean equals(Object obj) {//다형성 polymorphism : 부모의 참조변수에 자식의 객체를 담을 수 있는 성질
		if (obj instanceof Girl) {
			Girl g = (Girl) obj;
			return this.age == g.age && this.name.equals(g.name);
		}
		return false;
	}
	public int hashCode() {
		return (age+name).hashCode();
	}
	public String toString() {
		return "["+age+","+name+"]";
	}
	
}