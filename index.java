import java.util.*;
class index
{
	public static void main(String a[])
	{
		int a1[]=new int[a.length];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			a1[i]=Integer.parseInt(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(n==a1[i])
			{
				System.out.print(i);
			}
		}
	}
}