// 4. Write a Java program to empty an hash set. 

import java.util.*;

class HashsetDemo3
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
    fruits.removeAll(fruits);
    System.out.println(fruits);
    
   }
}