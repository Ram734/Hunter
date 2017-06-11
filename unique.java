import java.util.*;
class unique
{
	public static void main(String a[])
	{
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			n1[i]=sc.nextInt();
		}*/
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(i==j)
					{
					}
                 else
				 {
					 if(a[i].equals(a[j]))
					 {
						 a[i]="*";
						 a[j]="*";
					 }
				 }
				}
			}
			for(int k=0;k<a.length;k++)
			{
				if(a[k]!="*")
				{
					System.out.print(a[k]+" ");
				}
			}
	}
}