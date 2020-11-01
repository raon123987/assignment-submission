import java.io.*;
class Student
{
String name;
int m1,m2,p1,p2,c1;
void display()
{
System.out.println(name);
System.out.println(m1);
System.out.println(m2);
System.out.println(p1);
System.out.println(p2);
System.out.println(c1);
}

void calculate()
{
int Total=m1+m2+p1+p2+c1;
float Per=Total/5;
System.out.println("the percentage is "+Per);
if(Per<=80)
{
System.out.println("the A grade");
}
else if(Per<=60)
{
System.out.println("The B grade");
}
else
{
System.out.println("The C grade");
}
}
}
class mainStudent
{
public static void main(String args[])
{
Student sc=new Student();
sc.name="Prashant";
sc.m1=54;
sc.m2=67;
sc.p1=56;
sc.p2=66;
sc.c1=74;
sc.display();
sc.calculate();

Student sc2=new Student();
sc.name="Prajwal";
sc.m1=66;
sc.m2=69;
sc.p1=56;
sc.p2=88;
sc.c1=74;
sc.display();
sc.calculate();
}
}