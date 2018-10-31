class Notebook{
   Notebook(){
      System.out.println("Default constructor");
   }
   public void mymethod()
   {
      System.out.println("Void method of the class");
   }
   public static void main(String args[]){
	Notebook obj = new Notebook();
	obj.mymethod();
   }
}
