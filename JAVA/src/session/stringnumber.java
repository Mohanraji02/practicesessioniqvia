package session;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringnumber {

	
	public static void main(String[] s)
	{
		
		/*Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
	char c[]=b.toCharArray();
	
	for(int i=0;i<b.length();i++)
	{
		if(c[i]=='0'||c[i]=='1')
		{
		System.out.println(c[i]);
	}
	}*/
		
		
		/*String m="6789m45666ohan123";
		
		String str=m.replaceAll("[^0-9]", "");
System.out.println(str);
*/

Pattern p=Pattern.compile("\\d+");
Matcher m=p.matcher("1234mohan67");
while(m.find())
{
	System.out.println(m.group(0));
}


	}}
