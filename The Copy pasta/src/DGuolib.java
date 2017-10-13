
public class DGuolib
{
	public static String dateStr(String dte) 
	{
	return dte.substring(3,5) + "-" + dte.substring(0,2) + "-" + dte.substring(6,10);	
	}
 
 
	
	public static int sumUpTo(int x) 
	{	
		int b = 0;
		int d =0;
		while (d <= x)
		{	
			b = b + d;   
			d++;
		}
		return b;
	}
	public static void multiplicationTable(int base, int range)
	{	int x = 0;
		int n = 1; 
		while(range  >= n )
		{
			x = n * base;
			System.out.println(n + " " + x);
			n++;
		}
		  
	}
}
