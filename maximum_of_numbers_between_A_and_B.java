import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a,b,found=0,k=0,y[],min=0;
        n=sc.nextInt();
        x=new int[n];
        y=new int[n];
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
               y[k++]=x[i];
            }
        }
                
        for(int j=0;j<k-1;j++)
        {
           if(y[j]<y[j+1])
           min=y[j+1];
           else
           min=y[j];
           found=1;
        }
        if(found==1)
         System.out.print(min);
         if(found==0)
         System.out.println("-1");
    }
}