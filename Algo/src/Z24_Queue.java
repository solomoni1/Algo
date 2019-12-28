
public class Z24_Queue {
	public static int q[] = new int[5];
	public static int front = -1;
	public static int rear = -1;
	public static boolean isFull() {
		return rear == q.length-1;
	}
	public static boolean isEmpty() {
		return rear == front;
	}
	public static void enQueue(int data) {
		if(isFull()) {//공간이 없으면
			System.out.println("Queue overflow error");
		} else { //남아있으면 넣어주기
			q[++rear] = data;
		}
	}
	public static int deQueue() {
		if(isEmpty()) {//공간이 없으면
			System.out.println("Queue underflow error");
			return -1;
		} else { //남아있으면 넣어주기
			return q[++front];
		}
	}
	public static void main(String[] args) {
		q[++rear] = 1;
		q[++rear] = 2;
		q[++rear] = 3;
		System.out.println(q[++front]);
		System.out.println(q[++front]);
		System.out.println(q[++front]);
		
//		enQueue(1);
//		enQueue(2);
//		enQueue(3);
//		enQueue(4);
//		enQueue(5);
//		System.out.println(deQueue());
//		System.out.println(deQueue());
//		System.out.println(deQueue());
//		System.out.println(deQueue());
//		System.out.println(deQueue());
//		enQueue(6);
	}// end of main
}// end of class
