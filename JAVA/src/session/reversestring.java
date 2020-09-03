package session;

import java.util.Scanner;

public class reversestring {
	
	
	public static void main(String[] s)
	{
		
		
		Scanner sc=new Scanner(System.in);
		String actualdata=sc.nextLine();
		for(int i=0;i<4;i++)
		{
			
			
			switch(i)
			{
			
			case 0:
				char[] p=actualdata.toCharArray();
			for(int i1=actualdata.length()-1;i1>=0;i1--)
			{
				System.out.print(p[i1]);
			}
			break;
			
			
			
			case 1:
			int n=actualdata.length();	
			for(int i2=n-1;i2>=0;i2--)
			{
				System.out.print(actualdata.charAt(i2));
			}
			break;
			
			
			
			case 2:
				StringBuffer a=new StringBuffer("mohan");
				System.out.println(a.reverse());
				break;
				
			case 3:
				String rev[]=actualdata.split("");
				for(int j=rev.length-1;j>0;j--)
				{
					System.out.print(rev[j]);
				}
		}
	}

}
}