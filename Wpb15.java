//Write a Java program to compare two numbers by using if else.

import java.util.*;
public class Wpb15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+">"+b);
		}
		else if(a==b) {
			System.out.println(a+"=="+b);
			
		}
		else {
			System.out.println(a+"<"+b);
		}

	}

}
