package session;

import java.util.Scanner;

public class pattern {
	
	
	public static void main(String[] s)
	{
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
	    char c[]=name.toCharArray();
	    int n=name.length();
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<=i;j++)
	    	{
	    		System.out.print(c[j]);
	    	}
	    
	    System.out.println();
	    }
	}

}
