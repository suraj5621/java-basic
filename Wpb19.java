//Write a Java program to reverse a string.

import java.util.Scanner;

public class Wpb19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		int l = s.length();
		String c="";
		for(int i=l-1;i>=0;i--) {
			c=c+s.charAt(i);
		}
		System.out.println(c);
	}

}
