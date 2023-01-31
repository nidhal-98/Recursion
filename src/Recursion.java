
public class Recursion {

	public static void main(String[] args) {
		int number = 5;
		int result = factorial(number);
		System.out.println("Factorial of " + number + " is: " + result);
	}

	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
