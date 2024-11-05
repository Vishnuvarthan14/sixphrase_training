import java.util.*;

public class product_of_all_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int prod=1;
        for(int i=m;i<=n;i++)
        {
            prod=prod*i;
        }
        System.out.println(prod);
    }
}
