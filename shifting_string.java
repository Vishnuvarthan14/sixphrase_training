//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class shifting_string {
    public static void main(String[] args) {
        String s="abc";
        int shifts[]={3,5,9};
        char letters[]=s.toCharArray();
        String alp="abcdefghijklmnopqrstuvwxyz";

        for(int i=0;i<letters.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int index=alp.indexOf(letters[j]);
                int pos=index + shifts[i];
                while(pos>25)
                    pos=pos-26;
                letters[j]=alp.charAt(pos);
            }
        }
        System.out.println( String.valueOf(letters));

        }
    }
