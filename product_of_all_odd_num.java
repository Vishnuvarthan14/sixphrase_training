import java.util.Scanner;

public class product_of_all_odd_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int prod=1;
        for(int i=m;i<=n;i++)
        {
            if(i%2!=0)
            {
                prod=prod*i;
            }
        }
        System.out.println(prod);
    }
}
