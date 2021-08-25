// 10. Write a Java program to compare two hash set.

import java.util.*;
class HashSetDemo9
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
    
    Set <String> fruits1=new HashSet<>();
    fruits1.add("Mango");
    fruits1.add("Guava");
    fruits1.add("Kiwi");
    fruits1.add("Orange");
    fruits1.add("Watermelon");
     
    System.out.println("Second Hash Set:"+fruits1);

    HashSet<String>result_set = new HashSet<String>();
         for (String element : fruits)
         {
             System.out.println(fruits1.contains(element) ? "Yes" : "No");
          }
    
  }
}