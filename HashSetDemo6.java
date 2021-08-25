// 7. Write a Java program to convert a hash set to an array.

import java.util.*;
class HashSetDemo6
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
    String[] new_array = new String[fruits.size()];
    fruits.toArray(new_array);
     
    System.out.println("Array elements:");
    for(String element : new_array)
     {
        System.out.println(element);
     } 
  }
}