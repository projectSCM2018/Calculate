import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Input  :");
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Month month = new Month(num);
		
		System.out.println("Output : " + month.getMonthbynumber());
		
	}

}
