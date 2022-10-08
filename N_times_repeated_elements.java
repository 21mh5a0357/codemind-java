
import java.util.Scanner;
class Sanmple 
{

 public static void main(String[] args) 
{
// TODO Auto-generated method stu
int n,i,j,x[],count=0,flag=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
x=new int[n];
for(i=0;i<n;i++)
x[i]=sc.nextInt();
int k=sc.nextInt();
for(i=0;i<n;i++)
{
count=1;
if(x[i]!=-99)
{
for(j=0;j<n;j++)
{
if(x[i]==x[j] && i!=j)
{
count++;
x[j]=-99;
}
}
}
if(k==count)
{
System.out.print(x[i]+" ");
flag++;
}

}
if(flag==0)
System.out.println("-1");
}
}
