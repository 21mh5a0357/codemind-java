import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        for(int i=s1.length()-1;i>=0;i--)
        {
            char ch=s1.charAt(i);
            System.out.print(ch);
        }
    }
}