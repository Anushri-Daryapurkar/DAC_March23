class Pattern2_7
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int k1=4; k1>=i; k1--)
			{
				System.out.print(" ");
			}	
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int j=2; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int i=2; i<=5; i++)
		{
			for(int k1=2; k1<=i; k1++)
			{
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
