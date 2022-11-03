import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int max=0,count=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch!=' ')
            {
                count++;
            }
            else
            {
                if(count>max)
                max=count;
                count=0;
            }
            
        }
                if(count>max)
                max=count;
        System.out.println(max);
        
    }
}