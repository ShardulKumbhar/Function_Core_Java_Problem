//created a class for finding the triplets and counting them
class Triplets {

	// created methord for finding the triplets and counting them
	public int add() {

		// variable
		int counter = 0;
		int sum = 0;
		int arr[] = { 1, 2, -3, 3, -1, -2, 3, 5, -8 };

		// to get 1st value of array
		for (int i = 0; i < 7; i++) {
			// to get 2nd value of array
			for (int j = i + 1; j < 8; j++) {
				// to get 3rd value of array
				for (int k = j + 1; k < 7; k++) {
					sum = (arr[i] + arr[j] + arr[k]);
					int a = arr[i];
					int b = arr[j];
					int c = arr[k];
					if (sum == 0) {
						System.out.println("Array :" + sum);
						System.out.println("Array a :" + a);
						System.out.println("Array b:" + b);
						System.out.println("Array c:" + c);
						counter += 1;
						System.out.printf("Array triplets number :" + counter);
						System.out.println();
					}
				}
			}
		}

		System.out.println("Total no of Triplets in given array are =" + counter);
		return sum;
	}
}

public class Sum_Of_Three_Integer_Add_To_Zero {

	public static void main(String[] args) {

		Triplets obj1 = new Triplets();
		obj1.add();
	}

}
