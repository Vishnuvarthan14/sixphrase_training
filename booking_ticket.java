/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class booking_ticket
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    int age=sc.nextInt();
		    if(age>=60)
		    {
		        sum=sum+30;
		    }
		    else if(age<=12)
		    {
		        sum=sum+20;
		    }
		    else
		    {
		        sum=sum+50;
		    }
		}
		System.out.println(sum);
	}
}