import java.util.Scanner;
class Main
{
    public static boolean palin(int n)
    {
        int temp=n,rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(temp==rev)
        return true;
        else 
        return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            if(palin(x[i]))
            count++;
            
        }
        System.out.println(count);
        
        
    }
}