import java.util.HashMap;

public class HashingFunction
{
	
	HashMap<Integer ,Integer> h=new HashMap<Integer,Integer>();

  	public  HashingFunction()
  	{
  		int arr[]= {11,22,33,32,38};
  		int hash[]=new int[11];
		for(int i=0; i<arr.length; i++)
		{
			int rem = arr[i]%11;
			for(int j=0;j<11;j++)
			{
				if(rem==j)
				{
			if(h.get(hash[rem])==null)
			{
				h.put(hash[j],1);
			}
			else
			{
				h.put( hash[j],arr[i]++);
            }
		}
			System.out.println(h);
			}
		
	}
  	}
    public static void main(String[] args)
    {
    }
}