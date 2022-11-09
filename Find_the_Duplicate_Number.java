import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            count=1;
                for(int j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        System.out.print(x[i]);
                        count=2;
                        break;
                    }
                }
            if(count==2)
            break;
           
        }
    }
}