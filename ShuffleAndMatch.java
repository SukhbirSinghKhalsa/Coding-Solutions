import java.util.Scanner;
public class ShuffleAndMatch {
	static public void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	String X = scanner.next();
	String Y = scanner.next();
	int count = 0;
	for(int i = 0; i < X.length(); i++){
		for(int j = 0;  j < Y.length(); j++) {
			if(X.charAt(i) == Y.charAt(j)) {
				count++;
				Y = Y.substring(0,j)+"x"+Y.substring(j+1);
				break;
			}
		}
	}
	if(count  == X.length()) {System.out.println("YES");}
	else {System.out.println("NO");}
}
}
