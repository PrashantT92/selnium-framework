package Actionclass;

public class newtest
{
	public static void dectobon(int n) {
		
		int [] binarynum = new int[1000];
		int i =0;
		while (n>0)
		{
			binarynum[i]=n % 2;
			n=n/2;
					i++;
		}
		for (int j=1;j>=0;j--)
			System.out.println(j);
	}

	public static void main(String[] args)
	{

	    

	}

}
