/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={1,2,-2,4,-4};
		List <List<Integer>> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
		    int sum=0;
		    for(int j=i;j<arr.length;j++)
		    {
		       
		        sum=sum+arr[j];
		        if(sum==0)
		        {
		            List <Integer> seq=new ArrayList<>();
		           for(int k=i;k<=j;k++)
		           {
		               seq.add(arr[k]);
		           }
		           list.add(seq);
		        }
		        
		    }
		}
		int max=-1;
		int index=-1;
		for(int i=0;i<list.size();i++)
		{
		    if(list.get(i).size()>max)
		    {
		        index=i;
		        max=list.get(i).size();
		    }
		}
		System.out.println(list.get(index));
		
}