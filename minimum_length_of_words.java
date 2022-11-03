import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int min=9999,count=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch!=' ')
            {
                count++;
            }
            else
            {
                if(count<min)
                min=count;
                count=0;
                
            }
           
    
        }
         if(count<min)
          min=count;
        System.out.println(min);
    }
}