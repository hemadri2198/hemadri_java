
  class Example{
   Example(){
      System.out.println("Default constructor");
   }
   
   Example(int i, int j){
      System.out.println("constructor with Two parameters");
   }
 
   Example(int i, int j, int k){
      System.out.println("constructor with Three parameters");	      
   }
	   
  
   Example(int i, String name){
   System.out.println("constructor with int and String param");
   }
   public static void main(String args[]){
      Example obj = new Example();
      Example obj2 = new Example(12, 12);
      Example obj3 = new Example(1, 2, 13);
      Example obj4 = new Example(1,"BeginnersBook");
   }
}
