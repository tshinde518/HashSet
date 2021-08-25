// 9. Write a Java program to convert a hash set to a List/ArrayList. 

import java.util.*;
class HashSetDemo8
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
    System.out.println("Original Hash Set:"+fruits);

    List<String> list = new ArrayList<String>(fruits);
     
    System.out.println("ArrayList:"+list);
    
  }
}