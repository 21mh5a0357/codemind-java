import java.util.Scanner;
class pattern13
{
  public static void main(String args[])  
  {
      Scanner sc=new Scanner(System.in);
      int n,p=1;
      n=sc.nextInt();
      for(int i=n;i>=1;i--)
      {
          for(int j=1;j<=i;j++)
          {   
              
              System.out.print(j);
             
              
              
          }
          
          System.out.println();
      }
      
      
  }
}
