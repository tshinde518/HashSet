// 2. Write a Java program to iterate through all elements in a hash list.

import java.util.*;
import java.util.Iterator;
class HashsetDemo1
{
  public static void main(String [] args)
  {
    Set <String> fruits=new HashSet<>();
    fruits.add("Mango");
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cheery");
    
    Iterator<String> p=fruits.iterator();
    while(p.hasNext())
    {
      System.out.println(p.next());
    }
   }
}
