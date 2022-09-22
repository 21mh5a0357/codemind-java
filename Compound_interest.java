import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a;
        double p,r,t;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        a=p*(Math.pow((1+r/100),t));
        System.out.format("%.2f",a);
        
    }
}