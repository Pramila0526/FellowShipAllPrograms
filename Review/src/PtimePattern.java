
public class PtimePattern {
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
		int row=5;
		String space=" ";
		for(int i=0;i<row;i++)
		{
			for (int k=n-1;k<i;k--)
			{
				System.out.print(space);
			}
				
				while(prime(n)!=1)
				{
					n++;
				}
				System.out.print(" "+n);
				n++;
				}
				
			}
		
	

}