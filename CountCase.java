import java.util.Scanner;
public class CountCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		countLowerCase(input);
		countUpperCase(input);
		
	}
	/* 65 - 90 = upper case */
	private static void countUpperCase(String input) {
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			int compare = (int) input.charAt(i);
			if(compare >= 65 && compare <= 90)
				count++;
		}
		if(count > 0)
			System.out.println(count);
		else
			System.out.println("NA");

	}
	/* 97 - 122 = lower case */
	private static void countLowerCase(String input) {
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			int compare = (int) input.charAt(i);
			if(compare >= 97 && compare <= 122) 
				count++;
		}
		if(count > 0)
			System.out.println(count);
		else
			System.out.println("NA");
	}
}

