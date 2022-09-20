import java.util.Scanner;
class Main
{
    public static boolean self(int n)
    {
        int r;
        int temp=n;
        while(n>0)
        {
            
            r=n%10;
            if(r!=0)
            {
            if(temp%r!=0)
            return false;
            }
            else
              return false;
            n=n/10;
            
        }
        return true;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(self(i))
            System.out.print(i+" ");
        }
    }
}