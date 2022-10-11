import java.util.Scanner;

// swap variable
public class Wpb13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a+" "+b);
	}

}
