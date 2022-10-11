import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,sum=0,add=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<(int)n/2;i++)
        {
            
            sum=sum+x[i];
        }
         for(i=(int)n/2;i<n;i++)
        {
            add=add+x[i];
        }
        System.out.println(Math.abs(add-sum));
    }
}