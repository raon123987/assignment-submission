import java.util.Scanner;

class Addition
{
public static void main(String args[])
{
int Sum=0;
Scanner sc=new Scanner(System.in);
int no[]=new int[5];
System.out.println("enter the numbers\n");
for(int i=0;i<5;i++)
{
no[i]=sc.nextInt();
Sum = Sum+no[i];
}
System.out.println("the addition is "+Sum);
}
}