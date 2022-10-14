
//Write a Java program to print the odd numbers from 1 to n.
import java.util.Scanner;

public class Wpb24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
