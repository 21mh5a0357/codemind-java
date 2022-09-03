import java.util.Scanner;
class Main
{
    public static boolean palindrome(int n)
    {
        int sum=0,r,palin=n;
        
        while(n>0)
        
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(palin==sum)
        return true;
        else 
        return false;
    }
    public static boolean prime(int n)
    {
        int i,count=0;
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
        
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(palindrome(i) && prime(i))
            {
            System.out.println(i);
            break;
            }
        }
    }
}