import java.util.Scanner;

		class SqrRoot
		{
			static int a;
			static int b;
			int c;
			public double values()
			{
				//taking userinput value
				double sqroot=0;
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the value of a :");
				a = scanner.nextInt();
				System.out.println("Enter the value of b :");
				b = scanner.nextInt();
				System.out.println("Enter the value of c :");
				c = scanner.nextInt();
				
				//formula 
				double delta = ((b*b)-(4*(a*c)));
				System.out.println("delta = " + delta);
				sqroot =Math.sqrt(delta);
				System.out.println("SquareRoot of delta = "+ sqroot);
				return sqroot;
			}
			public static void roots(double sqroot)
			{
				//
				double Root1 = ((-b+sqroot)/(2*a));
				double Root2 = ((-b-sqroot)/(2*a));
				System.out.println("The Root 1 of X = " + Root1);
				System.out.println("The Root 2 of X = " + Root2);
			}
		}

		public class Quadratic_java {

			public static void main(String[] args) {
				//user input ans to 
				System.out.println("To find the roots of the given equation :");
				System.out.println("Given Equation is : (a*(x^2))+((b*x)+c)");
				SqrRoot Sqrt = new SqrRoot();
				Sqrt.values();
				SqrRoot Root = new SqrRoot();
				Root.roots(0);
				
			}

		}


