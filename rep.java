import java.util.*;
class rep
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int k=0;k<n;k++)
		{
			num[k]=sc.nextInt();
		}
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int i:num)
		{
			if(!ts.add(i))
			{
				System.out.print(i +" ");
			}
		}
		
	}
}