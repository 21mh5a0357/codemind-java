import java.util.*;
class Sample
{
    public static boolean palin(int n)
    {
        int rev=0;
        int temp=n;
        while(n>0)
        {
        rev=rev*10+n%10;
        n=n/10;
        }
        if(rev==temp)
        return true;
        else 
        return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(palin(n))
        System.out.println("True");
        else
        System.out.println("False");
    }
}