//3. Write a Java program to get the number of elements in a hash set.

import java.util.*;

class HashsetDemo2
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
    System.out.println("Size of elements:"+fruits.size());
    
   }
}