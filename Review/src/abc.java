
public class abc {
	static int prime(int n1)
	{
         int flag = 1;
        for(int i = 2; i <=n1/2; i++)
        {
            if(n1 % i == 0)
            {
            	flag=0;
            }
        }
        if(flag==1||n1==2)
        {
        	return 1;
        }else {
        	return 0;
        }
	}
	public static void main(String[] args)   
	{  
		int n=2;
		for(int i=0;i<5;i++)
		{
			System.out.println();
			for (int j=0;j<=2*i-1;j++)
			{
				while(prime(n)!=1)
				{
					n++;
				}
				System.out.print(" "+n);
				n++;
			}
		}
	}

}