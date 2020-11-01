import java.util.Scanner;

class Employee
{
String Name,designation;
int age,Salary;
void getDetails()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name of Employee\n");
Name=sc.next();
System.out.println("enter the age\n");
age=sc.nextInt();
System.out.println("enter the Salary\n");
Salary=sc.nextInt();
System.out.println("enter the designation\n");
designation=sc.next();
}

void displayDetails()
{
System.out.println("the name of Employee "+Name);
System.out.println("the age of employee  "+age);
System.out.println("the salary of employee "+Salary);
System.out.println("the designation of employee"+designation);
}
}