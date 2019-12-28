
public class Z15_pppppp {
	public static void main(String[] args) {
		//변수 : 기본형, 참조형
		CC c = new CC();
		c.pp();
	}
}
//class에 사용할 수 있는 접근 제어자 public, default
class Boy{
	int age;
	String name = "";
	// 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
	//생성자를 하나도 작성하지 않으면, 컴파일러가 기본 생성자를 추가해준다.
	
	//생성자는 클래스명과 동일한 이름을 쓴다, 리턴 값을 줄 수 없다.
	//객체를 생성할 때마다 가장 먼저 한번씩 호출됨, 인스턴스 변수들의 초기화 작업을 주로 담당
	public Boy() {
		this(1,"홍길동");
	}
	//생성자에게서 다른 생성자를 호출하지 않으면, 컴파일러가 부모의 기본생성자를 호출하는 super()를 삽입해준다.
	public Boy(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
}
class GP{
	int x;
}
class PP extends GP{
	int x;
}
class CC extends PP{
	int x;
	void pp() {
		int x;
	}
}