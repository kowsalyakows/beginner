import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    String str,strr;
	    Scanner s=new Scanner(System.in);
	    str=s.nextLine();
	    StringBuilder sb=new StringBuilder(str); 
	    strr=sb.append(".").toString();
	    
		System.out.println(sb);
	}
}
