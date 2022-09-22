import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        int p,r,t;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        a=p*t*r/100;
        System.out.println(a);
        
    }
}