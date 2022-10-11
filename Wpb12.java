import java.util.Scanner;

//Write a Java program to print the area and perimeter of a rectangle.
public class Wpb12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		float length=sc.nextFloat();
		float breadth=sc.nextFloat();
		double perimeter=2*(length+breadth);
		double area =length*breadth;
		System.out.println(perimeter);
		System.out.println(area);
		
	}

}
