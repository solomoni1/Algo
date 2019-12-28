
public class Z24_원형Queue {
	public static int q[] = new int[5];
	public static int front = -1;
	public static int rear = -1;
	public static boolean isFull() {
		return (rear+1) % q.length == front;
	}
	public static boolean isEmpty() {
		return rear == front;
	}
	public static void enQueue(int data) {
		if(isFull()) {//공간이 없으면
			System.out.println("Queue overflow error");
		} else { //남아있으면 넣어주기
			rear++;
			if(rear == q.length) {
				rear = 0;				
			}
//			rear = (rear +1) % q.length; //위 코드로 대체
			q[rear] = data;
		}
	}
	public static int deQueue() {
		if(isEmpty()) {//공간이 없으면
			System.out.println("Queue underflow error");
			return -1;
		} else { //남아있으면 넣어주기
			front++;
			if(front == q.length) {
				front = 0;
			}
//			front = (front + 1) % q.length;//위 코드로 대체
			return q[front];
		}
	}
	public static void main(String[] args) {
//		q[++rear] = 1;
//		q[++rear] = 2;
//		q[++rear] = 3;
//		System.out.println(q[++front]);
//		System.out.println(q[++front]);
//		System.out.println(q[++front]);
		
		enQueue(1);
		enQueue(2);
		enQueue(3);
		enQueue(4);
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		enQueue(6);
		System.out.println(deQueue());
	}// end of main
}// end of class
