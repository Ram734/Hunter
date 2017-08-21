import java.util.*;
class rep2
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
		TreeSet<Integer> hs=new TreeSet<Integer>();
		for(int i:num)
		{
			if(!hs.add(i))
			{
				System.out.print(i);
				break;
			}
		}
		
	}
}