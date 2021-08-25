// 6. Write a Java program to clone a hash set to another hash set.

import java.util.*;

class HashsetDemo5
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
    HashSet<String> c=new HashSet<>();
    c = (HashSet)fruits.clone(fruits); 
    System.out.println(c);
  
    
   }
}