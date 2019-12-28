import java.io.IOException;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) throws IOException {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		//선택제어문 자가진단1
//		int a=input1.nextInt();
//		System.out.println(a);
//		if (a<0) {
//			System.out.println("minus");
//		}
		
		//선택제어문 자가진단2
		int height=input1.nextInt();
		int weight=input1.nextInt();
		System.out.println(weight+100-height);
		if (weight+100-height>0) {
			System.out.println("Obesity");
		}
		
		//선택제어문 자가진단3
		int age=input1.nextInt();
		if (age>20) {
			System.out.println("adult");
		} else {
			System.out.println(20-age+" years later");
		}
//		
//		//선택제어문 자가진단4
//		double weight2=input1.nextDouble();
//		if (weight2 <= 50.80) 
//			System.out.println("Flyweight");
//		else if (weight2 <= 61.23)
//			System.out.println("Lightweight");
//		else if (weight2 <= 72.57)
//			System.out.println("Middleweight");
//		else if (weight2 <= 88.45)
//			System.out.println("Cruiserweight");
//		else
//			System.out.println("Heavyweight");
//		
//		//선택제어문 자가진단5
//		double A=input1.nextDouble(),B=input2.nextDouble();
//		if (A>=4.0&&B>=4.0)
//			System.out.println("A");
//		else if (A>=3.0&&B>=3.0)
//			System.out.println("B");
//		else 
//			System.out.println("C");
//		
//		//선택제어문 자가진단6
//		char gender=(char) System.in.read();
//		System.in.read();
//		int age2=input1.nextInt();
//		if (gender == 'M' && age2 >= 18)
//			System.out.println("MAN");
//		else if (gender == 'M' && age2 < 18)
//			System.out.println("BOY");
//		else if (gender == 'F' && age2 >= 18)
//			System.out.println("WOMAN");
//		else
//			System.out.println("GIRL");
//		
//		//선택제어문 자가진단7
//		char score=(char) System.in.read();
//		System.in.read();
//		if (score == 'A')
//			System.out.println("Excellent");
//		else if (score == 'B')
//			System.out.println("Good");
//		else if (score == 'C')
//			System.out.println("Usuallt");
//		else if (score == 'D')
//			System.out.println("Effort");
//		else if (score == 'F')
//			System.out.println("Failure");
//		else
//			System.out.println("error");
//		
//		//선택제어문 자가진단8
//		double score2=input1.nextDouble();
//		switch((int)score2) {
//		case 4:System.out.println("scholarship");
//		break;
//		case 3:System.out.println("next semester");
//		break;
//		case 2: System.out.println("seasonal sememster");
//		break;
//		case 1: System.out.println("retake");
//		break;
//		default:break;
//		}
//			
//		//선택제어문 자가진단9
//		int a9=input1.nextInt(),b9=input2.nextInt(),c9=input3.nextInt();
//		int min;
//		min=a9>b9?b9:a9;
//		min=c9>min?min:c9;
//		System.out.println(min);
//		
//		//반복제어문1 자가진단1
//		int i1=1;
//		while(i1<=15) {
//			System.out.print(i1+" ");
//			i1++;
//		}System.out.println();
//		
//		//반복제어문1 자가진단2
//		int sum=0;
//		int num=input1.nextInt();
//		int i2=1;
//		while (i2<=num) {
//			sum+=i2;
//			i2++;
//		}
//		System.out.println(sum);
//		
//		//반복제어문1 자가진단3
//		int num1;
//		while (true) {
//			System.out.print("number?");
//			num1=input1.nextInt();
//			System.out.println(num1);
//			if (num1==0)
//				break;
//			else if (num1 > 0)
//				System.out.println("positive number");
//			else
//				System.out.println("negative number");
//		}
//		
//		//반복제어문1 자가진단4
//		int num2;
//		int sum2=0;
//		int gae=0;
//		while(true) {
//			num2=input1.nextInt();
//			if(num2<100) {
//				sum2+=num2;
//				gae++;
//			}
//			else if (num2 >= 100) {
//				sum2+=num2;
//				gae++;
//				System.out.println(sum2);
//				System.out.println((double)sum2/gae);
//				break;
//			}
//		}
//		//반복제어문1 자가진단5
//		int num3;
//		while (true) {
//			num3=input1.nextInt();
//			if (num3==-1)
//				break;
//			else if (num3%3 == 0)
//				System.out.println(num3/3);
//		}
		
		//반복제어문1 자가진단6
		
		//반복제어문2 자가진단1
		//반복제어문2 자가진단2
		//반복제어문2 자가진단3
		//반복제어문2 자가진단4
		//반복제어문2 자가진단5
		//반복제어문2 자가진단6
		//반복제어문2 자가진단7
		//반복제어문2 자가진단8
		//반복제어문3 자가진단1
		//반복제어문3 자가진단2
		//반복제어문3 자가진단3
		//반복제어문3 자가진단4
		//반복제어문3 자가진단5
		//반복제어문3 자가진단6
		//반복제어문3 자가진단7
	}
}
