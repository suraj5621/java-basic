//Write a Java program to find the number of values in a given range divisible by a given value.
import java.util.Scanner;

public class Wpb28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n =sc.nextInt();
		for(int i=1;i<=m;i++) {
			if (i%n==0) {
				System.out.println(i);
			}
		}
		

	}

}
