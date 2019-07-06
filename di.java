import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,l1=0;
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		int l=st.length();
		for(i=0;i<l;i++)
		{
		    if(st.charAt(i)!=' ')
		    {
		        l1++;
		    }
		}
		System.out.println(l1);
	}
}
