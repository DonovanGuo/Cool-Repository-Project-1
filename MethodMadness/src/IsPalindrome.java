
// not complete

public class IsPalindrome {
	
	// main method used for temp testing, will delete later
	
	public static void main(String[] args) {
		isPalindrome("deeznuts");
	}
	
	public static boolean isPalindrome(String str) {
		int xa = 0;
		int yb = str.length();
		
		int ya = 1;
		int xb = str.length() - 1;
		
		while (ya < str.length() / 2) {
			
			if (str.substring(xa, ya).equals(str.substring(xb, yb))) {
				
				ya = xa + 1;
				xb = yb - 1;
				
				xa++;
				yb--;

			} else {
			System.out.println(str + " is not a palindrome");
			return false;
			}
		} 
		System.out.println(str + " is a palindrome");
		return true;
	}
}
