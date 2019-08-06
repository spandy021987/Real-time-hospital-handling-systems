package Package1;

public class Triangle {
	public static void main(String[] args)
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((i+j) >=(n+1))
					
				{
					System.out.print("*");
					
				}
				else {
					
				
				System.out.print("");
			}
			}
			System.out.println();
		}
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(j>i)
				
			{
				System.out.print("*");
				
			}
			else {
				
			
			System.out.print("");
		}}
	
		System.out.println();
	}

	}}


