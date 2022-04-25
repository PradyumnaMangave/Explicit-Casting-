import java.util.*;  
public class mapEx {  
public static void main(String[] args) {  
    Map map=new HashMap();  
    //Adding elements to map  
    map.put(1,"Chandani");  
    map.put(2,"Tejas");  
    map.put(3,"Jaya");  
    map.put(4,"Amit");  
   
    System.out.println("\nThe elements of HashMap are ");  
    
    Set set=map.entrySet();  
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
        
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
}  
}  