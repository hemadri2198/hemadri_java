class superclass
{
int age;
superclass(int age)
{
this age=age;
}
public void getage()
{
System.out.println("the values of the variable named age in supeclass",age);
}
}
public clas subclass
{
subclass(int age)
{
super(age);
}
public static void main(string[]args)
{
subclass s=new subclass(24);
s.getage();
}
}

