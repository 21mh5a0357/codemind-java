import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a;
        int r;
        r=sc.nextInt();
        a=3.14f*r*r;
        System.out.format("%.2f",a);
        
    }
}