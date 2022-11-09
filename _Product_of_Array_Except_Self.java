import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x[],prod=1;
        x=new int[n];
        for(int i=0;i<n;i++){
        x[i]=sc.nextInt();
        prod=prod*x[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(prod/x[i]+" ");
        }
    }
}