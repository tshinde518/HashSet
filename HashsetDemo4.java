// 5. Write a Java program to test a hash set is empty or not. 
import java.util.*;

class HashsetDemo4
{
  public static void main(String [] args)
  {
    Set <String> fruits=new HashSet<>();
    fruits.add("Mango");
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cheery");
    fruits.add("Orange");
    fruits.add("Cheery");
    System.out.println(fruits.isEmpty());
    fruits.removeAll(fruits);
    System.out.println(fruits.isEmpty());
    
   }
}