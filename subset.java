import java.util.*;
class subset
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			n1[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		int d1[]=new int[d];
		for(int i=0;i<d;i++)
		{
			d1[i]=sc.nextInt();
		}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<d;j++)
				{
					if(n1[i]==d1[j])
					{
					   c++;
					}
				}
			}
			if(c>0)
			{
				System.out.print("Given Arrays are subset");
			}
			else
			{
				System.out.print("Given Arrays are not subset");
			}
	}
}