package sumave1;
import java.util.Scanner;
public class Swapusingtemp {

	public static void main(String[] args) {
		int a,b,temp=0;
		System.out.println("enter the two numbers");
		Scanner q=new Scanner(System.in);
		a=q.nextInt();
		b=q.nextInt();
		System.out.println("bofore swapping a is:"+a);
		System.out.println("bofore swapping b is:"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("bofore swapping a is:"+a);
		System.out.println("bofore swapping b is:"+b);
}
}
