// 12. Write a Java program to remove all of the elements from a hash set.

import java.util.*;
class HashSetDemo11
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
    System.out.println("First Hash Set:"+fruits);
    fruits.removeAll(fruits);
    
     System.out.println(fruits);
    
  }
}