//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class sum_of_squr_integer {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int sum=0;
            for(int i=n;i<=m;i++)
            {
                sum=sum+i*i;
            }
            System.out.println(sum);
        }
    }