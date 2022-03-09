/*
Check given number divisibly by all three number, if true return "YES" else return "NO"

sample
N = 24				N = 21
a,b,c = 2,4,8			a,b,c = 1,3,9
Output: YES			Output: NO

*/
import java.util.Scanner;
	public class DivisibilityCheck {
	static public void main(String args[]) {
		//taking inputs N,a,,b,c from users
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		//check for divisibility
		checkDivisibility(N,a,b,c);
		//test cases
		checkDivisibility(24,2,8,4);
		checkDivisibility(21,2,3,9);
		checkDivisibility(22,2,11,22);
	}
	static void checkDivisibility(int N, int a, int b, int c) {
		//check for divisibility
		if( N % a == 0 && N % b == 0 && N % c == 0)
		  System.out.println("YES");
		else 
		  System.out.println("NO");
}
}
