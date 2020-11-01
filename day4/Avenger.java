import java.util.Scanner;

class Avenger
{
String name,planet,weapon;
int age;
public void getDetails()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of Avenger\n");
name=sc.next();
System.out.println("Enter the age of Avenger\n");
age=sc.nextInt();
System.out.println("Enter the planet of Avenger\n");
planet=sc.next();
System.out.println("Enter the weapon of Avenger\n");
weapon=sc.next();
}
public void displayDetails()
{
System.out.println("the name of Avenger\n"+name);
System.out.println("the age of Avenger\n"+age);
System.out.println("the planet of Avenger\n"+planet);
System.out.println("the weapon of Avenger\n"+weapon);

}
}

class MainAvenger
{
public static void main(String args[])
{
Avenger ae[]=new Avenger[5];
for(int i=0;i<5;i++)
{
Avenger a=new Avenger();
a.getDetails();
a.displayDetails();
}
}
}