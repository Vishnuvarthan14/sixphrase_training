import java.util.Scanner;

public class sum_of_factorial_of_all_integer {
    static int findfact(int n)
    {
        if(n<=2)
            return n;

        return n*findfact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            int fact=findfact(i);
            sum=sum+fact;
        }
        System.out.println(sum);
    }
}
