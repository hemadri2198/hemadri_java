class superclass
{
int age;
superclass(int age)
{
this age = age;
}
public void get age()
{
System.out.println("the values of the variable named age in supeclass",age);
}
}
public class subclass
{
subclass(int age)
{
super(age);
}
public static void main(string[]args)
{
subclass s=new subclass(24);
s.get age();
}
}

