import java.util.Scanner;

public class Sum_of_squr_all_prime {
    static boolean checkprime(int n)
    {
        boolean check=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                check=false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            if(checkprime(i))
            {
                sum=sum+i*i;
            }
        }
        System.out.println(sum);
    }
}
