import java.io.*;

class Oddno
{
public static void main(String args[])
{
int No[]=new int[5];
for(int i=0;i<5;i++)
{
No[0]=2;
No[1]=3;
No[2]=4;
No[3]=5;
No[4]=6;
if(No[i]%2!=0)
{
System.out.println("The odd no are\n");
System.out.println(No[i]);
}
}
}
}