class outerClass {
   int num;
   
   // inner class
   private class innerClass {
      public void print() {
         System.out.println("This is an inner class");
      }
   }
   
   // Accessing he inner class from the method within
   void display_Inner() {
      innerClass inner = new innerClass();
      inner.print();
   }
}
   
public class Main{

   public static void main(String args[]) {
      // Instantiating the outer class 
      outerClass outer = new outerClass();
      
      // Accessing the display_Inner() method.
      outer.display_Inner();
   }
}