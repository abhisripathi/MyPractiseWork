/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.*;
public class Main
{
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++)
	    {
	         arr[i]= sc.nextInt();
	    }
	    System.out.println("count of the numbers which have the digit 9 in them:" + countNumber(arr,n));
	}
	
	public static int countNumber(int[] arr, int n)
	{
	    int count = 0 ;
	    if(arr.length == 0) return 0;
	        
	    for(int i=0; i<arr.length; i++)
	    {
	   
	       while(arr[i] != 0)
	       {
	            int x=arr[i]%10;
	            if(x==9) count++;
	            arr[i]=arr[i]/10;
	                
	       }  
	       //return 0;
	    }
	    return count;
	}
}
