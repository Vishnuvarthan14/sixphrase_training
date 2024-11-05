import java.util.*;
public class Redpen_Greenpen
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int pos=0;
		for(int i=0;i<n;i++)
		{
		    if(arr[i]!=0)
		    {
		        int temp=arr[pos];
		        arr[pos]=arr[i];
		        arr[i]=temp;
		        pos++;
		    }
		}
		System.out.println(Arrays.toString(arr));
	}
}