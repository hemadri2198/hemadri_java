class A
{
   public void methodA()
   {
     System.out.println("Base class method");
   }
}

class H extends A
{
   public void methodH()
   {
     System.out.println("Child class method");
   }
   public static void main(String args[])
   {
     H obj = new H();
     obj.methodA(); //calling super class method
     obj.methodH(); //calling local method
  }
}
