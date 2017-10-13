
public class ADiPietroLib {

	public static boolean isFibonacci(int x) {		
		
		int a = 1;
		int b = 2;
		
		while (b < x) {			
			a = a + b;
			b = a + b;			
		}
		
		if ((a == x) || (b == x)) {
			System.out.println(x + " is in the Fibonacci sequence");
			return true;
		}
		else {
			System.out.println(x + " is not in the Fibonacci sequence");
			return false;
		}
	}
	
	public static boolean isPalindrome(String str) {
		
		int xa = 0;
		int yb = str.length();
		
		int ya = 1;
		int xb = str.length() - 1;
		
		while (ya < ((str.length() / 2) + 1)) {
			
			if (str.substring(xa, ya).equals(str.substring(xb, yb))) {
				
				xa++;
				yb--;
				ya = xa + 1;
				xb = yb - 1;
			
			} else {
				System.out.println(str + " is not a palindrome");
				return false;
			}
		}	
		System.out.println(str + " is a palindrome");
		return true;
	}
	
	public static void quadSolver(int a, int b, int c) {
		
		double m = ((b * -1) + java.lang.Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		double n = ((b * -1) - java.lang.Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		
		if (((a * m * m) + (b * m) + c) == 0) {
			System.out.println("x = " + m);
		}
		if (((a * n * n) + (b * n) + c) == 0) {
			System.out.println("x = " + n);
		}
	}
}
