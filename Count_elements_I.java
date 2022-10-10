import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,m,y[],c=0;
        n=sc.nextInt();
        m=sc.nextInt();
        x=new int[n];
        y=new int[m];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++)
        {
            y[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(x[i]==y[j])
                {
                    set.add(x[i]);
                    break;
                }
            }
        }
        
         
       
        System.out.println(set.size());
    }
}