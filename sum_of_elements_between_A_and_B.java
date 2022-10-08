import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             if(x[i]>=a && x[i]<=b)
             sum=sum+x[i];
         }
          System.out.println(sum);
    }
}
