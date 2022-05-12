package programs;

public class pyramid {

	public static void main(String[] args) 
	{
		triangle1();
	}
	public static void triangle1()
	{
		int i, j, k,l;

        for ( i = 1; i <= 5; i++)
        {
        	for (j = 1; j<= 5 - i; j++) 
        	{
        		System.out.print(" ");
            } 
        	for (k = i; k >= 1; k--)
        	{
        		System.out.print(k);
        	}
        	for ( l = 2; l <= i; l++)
        	{
        		System.out.print(l);
            } 
        	System.out.println(); 
        } 
        //bottom diamond pattern
        for ( i = 4; i >= 1; i--)
        {
        	for ( j = 0; j<= 4 - i; j++) 
        	{ 
        		System.out.print(" ");
            }
        	for ( k = i; k >= 1; k--)
        	{
        		System.out.print(k);
        	}
        	for ( l = 2; l <= i; l++)
        	{
        		System.out.print(l);
        	}
        	System.out.println();
        }
	}
}
