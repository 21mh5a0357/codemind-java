import java.util.*;
 class array{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt(),count=0;
         int m=sc.nextInt();
         int x[]=new int[n];
         int y[]=new int[m];
         for(int i=0;i<n;i++)
             x[i]=sc.nextInt();
         for(int i=0;i<m;i++)
             y[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<m;j++){
                if(x[i]==y[j])
                {
                  count++;
                }
                }
                if(count==0)
                System.out.print(x[i]+" ");
            
            }   
        for(int i=0;i<m;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(x[j]==y[i])
                {
                  count++;
                }
                }
                if(count==0)
                System.out.print(y[i]+" ");
            
            }   
    }
 }