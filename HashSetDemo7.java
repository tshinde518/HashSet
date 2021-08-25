// 8. Write a Java program to convert a hash set to a tree set.  

import java.util.*;
class HashSetDemo7
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

    Set<String> tree_set = new TreeSet<String>(fruits);
     
    System.out.println("Treeset elements:");
    for(String element : tree_set)
     {
        System.out.println(element);
     } 
  }
}