import java.util.*;
class ad
{
	public static void main(String args[])
	{
		int n[]=new int[args.length];
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Set<Integer> ss=new HashSet<Integer>();
		for(int i=0;i<args.length;i++)
		{
			n[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<args.length;i++)
		{
		   ss.add(n[i]);
		}	
			int m1=0;
			int m2=0;
		for(int i=0;i<args.length;i++)
		{
			if(n[i]==n1)
			{
				m1=i;
			}
			if(n[i]==n2)
			{
				m2=i;
			}
		}
			System.out.print(m1-m2);
	}
}
