

//Write a Java program to compute the area of a polygon. formula is : (n*s^2)/(4*tan(π/n))

import java.util.Scanner;
public class Wpb17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no. of side");
		int n=sc.nextInt();		
		System.out.println("enter length of one side");
		int l =sc.nextInt();
		double area=(n*l*l)/(4*Math.tan(Math.PI/n));
		System.out.println(area);
	}

}
