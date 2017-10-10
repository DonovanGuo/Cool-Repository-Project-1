
public class IsFibonacci {

	public static void main(String[] args) {
		isFibonacci(6);
	}
	
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
	
}
