import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,a,b,min=9999,found=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
         for(int i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                if(x[i]<min)
                {
                    min=x[i];
                    found=1;
                }
            }
        }
        if(found==1)
        System.out.println(min);
        else
        System.out.println(-1);
    }
}