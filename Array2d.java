import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		
		//user input coloum rows
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of coloum less than 4 :");
		int M = scanner.nextInt();
		System.out.println("Enter the no. of rows less than 6 :");
		int N = scanner.nextInt();
		
		int arr[][] = {{ 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 }};
        //logic
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("  " + arr[i][j]);
			}
			System.out.println();
		}

	}

}
