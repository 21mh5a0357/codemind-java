import java.util.*;
import java.util.Map.*;
class Main
{
    public static float output(int arr[])
    {
        int count=0,sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry entry:hm.entrySet())
        {
            if((int)entry.getKey()==(int)entry.getValue())
            {
                sum=sum+(int)entry.getKey();
                count++;
            }
        }
        if(count==0)
        {
            return -1;
        }
        else
        return (float)sum/count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x[];
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        float result=output(x);
        if(result<0)
        System.out.println(-1);
        else
        System.out.format("%.2f",result);
        
    }
}