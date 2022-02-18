import java.util.Scanner;

public class Distance_Java {

	public static void main(String[] args) {
		// taking command line arrguiment x,y
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter command line arrgument x  ::");
		int x = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter command line arrgument y ::");
		int y = sc1.nextInt();

		// formula to calculate
		double distance = Math.sqrt(x * x + y * y);
		System.out.println(distance);

	}

}
