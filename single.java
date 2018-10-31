Class A
{
   public void methodsingle()
   {
     System.out.println("Base class method");
   }

Class B extends A
{
   public void methodB()
   {
     System.out.println("Child class method");
   }
   public static void main(String args[])
   {
     B obj = new B();
     obj.methodA(); 
     obj.methodB();
  }
}
