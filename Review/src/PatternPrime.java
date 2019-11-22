public class PatternPrime {
	static int prime(int n1)
	{
         boolean prime=true;;
        for(int i = 2; i <=n1-1; i++)
        {
            if(n1 % i == 0)
            {
            	prime=false;
            }
        }
        if(prime)
        {
        	return 1;
        }else {
        	return 0;
        }
	}
	public static void main(String[] args)   
	{  
		int n=2;
		for(int i=0;i<=4;i++)
		{
			
			System.out.println();
			for (int j=0;j<=7;j++)
			{
				if(j>=5-i && j<=i+3)
				{
				while(prime(n)!=1)
				{
					n++;
				}
				System.out.print(n+ " ");
				n++;
			}
				else
				{
					System.out.print(" ");
				}
				
			}
		}
	}

}