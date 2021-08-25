// 11. Write a Java program to compare two sets and retain elements which are same on both sets. 

import java.util.*;
class HashSetDemo10
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

    fruits.retainAll(fruits1);
     System.out.println("HashSet content:");
     System.out.println(fruits);
    
  }
}