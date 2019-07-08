package com.savio.linkedlist;

public class App {

   public static void main(String[] args){
       List<Integer> integerList = new LinkedList<>();
       integerList.insert(1);
       integerList.remove(1);
       integerList.insert(2);
       integerList.insert(-12);
       integerList.insert(100);
       integerList.insert(89);
       integerList.remove(89);

       integerList.traverse();
       System.out.println();
       System.out.print("Size: " + integerList.size());

   }

}
