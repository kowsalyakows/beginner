import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n,flag=0,i,c=0;
	    n=s.nextInt();
	   
	    for(i=2;i<n/2;i++)
	        {
	           if(n%i==0) 
	           {
	           flag=1;
	           if(i!=n)
	           {
	           c++;
	           }
	           System.out.println(i);
	           }
	        }
	     if(flag==0)
		System.out.println("yes");
		else if(flag==1 && c>0)
		System.out.println("No");
	}
}
