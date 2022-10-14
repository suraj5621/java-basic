//Write a Java program and compute the sum of the digits of an integer

import java.util.Scanner;

public class Wpb16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int rem,sum=0;
		while(a!=0) {
			rem=a%10;
			sum=sum+rem;
			a=a/10;
			
		}
		System.out.println(sum);
	}

}
