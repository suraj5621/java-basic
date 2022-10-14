//Write a Java program to print numbers between 1 to 100 which are divisible by 3and5 both .
import java.util.Scanner;

public class Wpb26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}

}
