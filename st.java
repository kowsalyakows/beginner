import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    String s1,s2;
	    int l1,l2;
	    Scanner s=new Scanner(System.in);
	    s1=s.next();
	    s2=s.next();
	    l1=s1.length();
	    l2=s2.length();
	    if(l1==l2)
		System.out.println(s1);
		else if(l1>l2)
		System.out.println(s1);
		else
		System.out.println(s2);
	}
}
