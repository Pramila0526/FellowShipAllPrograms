import java.util.HashMap;

public class Hashing 
{
public static void hashing(int arr[])
{
	HashMap<Integer ,Integer> h=new HashMap<Integer,Integer>();
	int rem;
	int hash[]=new int[11];
	
    for(int i=0;i<arr.length;i++)
	{
	   rem=arr[i]%11;
	
		for(int j=0;j<11;j++)
		{
			
		if(rem==j)
		if(h.get(hash[j])==null)
		{
			h.put(arr[i],hash[0]);
		}
		else
		{
			h.put(arr[i], hash[j]++);
		}
		
	}
 
}
System.out.println(h);
}

public static void main(String args[])

{
	int arr[]= {11,22,33,32,38};
	Hashing.hashing(arr);
}
}
/*for( j=0;j<hash.length;j++)
{s
	if(rem==j)
	{
		hash[j]=i;
		
	}
	
}
System.out.println(j+ ":" +a[i]);*/

