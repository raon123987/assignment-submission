import java.io.*;
import java.util.Scanner;

class Employee
{
String name;
int birthdate;
int birthyear;
int Salary;

void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name of Employee\n");
String name=sc.nextLine();
System.out.println("enter the the birthdate\n");
birthdate=sc.nextInt();
System.out.println("enter the birthyear\n");
birthyear=sc.nextInt();
System.out.println("enter the Annual Salary\n");
Salary=sc.nextInt();
}

void tax()
{
if(Salary<=500000)
{
System.out.println("The Employee pays 20% tax");
}
else if(Salary<=300000)
{
System.out.println("the employee pays 15% tax");
}
else if(Salary<=200000)
{
System.out.println("the Employee Pays 10% tax");
}
else
{
System.out.println("the Employee pays 5% tax");
}
}


void display()
{
System.out.println("the name of Employee  "+name);
System.out.println("the  birthdate of Employee  "+birthdate);
System.out.println("the birthyear of Employee  "+birthyear);
System.out.println("the Salary of Employee  "+Salary);
}


}

class MainEmployee
{
public static void main(String args[])
{
Employee e1=new Employee();
e1.accept();
e1.display();
e1.tax();
}
}