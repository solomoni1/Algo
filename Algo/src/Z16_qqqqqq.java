
public class Z16_qqqqqq {
	public static void main(String[] args) {
		//overloading : 하나의 클래스 내에서 동일한 메서드명을 사용하는 기법
		//조건 : 매개변수의 개수 or 타입 or 순서가 달라야한다.
		//overriding : 두 클래스(부모-자식) 관계에서 부모클래스의 메서드를 자식클래스에서 재정의 하는 기법
		C c = new C();
		c.print();
//		new Man();//abstract class는 객체 생성 불가
	}
	void a(boolean x, int y) {}
	void a(int y ,boolean x) {}
	void a(boolean x) {}
	void a(int x) {}
	void a() {}
}
abstract class Man{//추상 클래스
	int a;//변수
	static int b;
	abstract void p();//추상 메서드
	void q() {//일반 메스드
		
	}
}
interface Movable{
	void move();
}
interface Fightable{
	void fight();
}
interface Attackable extends Movable, Fightable{//interface 끼리는 다중상속이 가능
	
}
class Attack implements Attackable {
	public void move() {
	}
	public void fight() {
	}
}
interface Aable{//알맹이는 하나도 없는 완전한 껍데기, 상수, 추상메서드
	public static final int a = 3;
	int b = 7;//부족한 제어자를 컴파일러가 추가해준다.
	public abstract void p();
	void q();//부족한 제어자를 컴파일러가 추가해준다.
}









class P {
	void print() {
		System.out.println("안녕 난 P야");
	}
}
class C extends P{
	void print() {
		System.out.println("안녕 난 C야");
	}
}