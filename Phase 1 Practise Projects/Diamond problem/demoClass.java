interface firstDemo  

{  

public default void display()   

{  

System.out.println("First Demo");  

}  

}  

interface secondDemo  

{  

public default void display()   

{  

System.out.println("Second Demo");  

}  

}  

public class demoClass implements firstDemo, secondDemo  

{  

public void display()   

{  

firstDemo.super.display();  

secondDemo.super.display();  

}  

public static void main(String args[])   

{  

demoClass obj = new demoClass();  

obj.display();  

}  

}  

 