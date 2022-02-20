import java.util.Scanner;

public class Wind_Chill {

	public static void main(String[] args) {
		// scanner and varable
		Scanner scan = new Scanner(System.in);
		double windSpeed, temperature, windChill;

		// collect user input
		System.out.println("Enter the temperature(Fahrenheit): ");
		temperature = scan.nextDouble();
		System.out.println("Enter wind speed: ");
		windSpeed = scan.nextDouble();

		// calciulate wind chill
		windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

		// print out result
		System.out.println("Wind CHill is :" + Math.floor(windChill));
	}

}
