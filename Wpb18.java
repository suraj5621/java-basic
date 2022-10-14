//Write a Java program to compute the distance between two points on the surface of circle or earth .
//    formula is :d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

import java.util.Scanner;

public class Wpb18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the radius of Circle");
		double radius=sc.nextDouble();
		System.out.println("Enter X1");
		float x1= sc.nextFloat();
		System.out.println("Enter x2");
		float y1= sc.nextFloat();
		System.out.println("Enter y1");
		float x2= sc.nextFloat();
		System.out.println("Enter y2");
		float y2= sc.nextFloat();
		
		x1 = (float) Math.toRadians(x1);
        y1 = (float) Math.toRadians(y1);
        x2 = (float) Math.toRadians(x2);
        y2 = (float) Math.toRadians(y2);
//		d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
		double d=radius*Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
		System.out.println(d);
	}

}
