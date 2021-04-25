/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructures;

import java.util.*;

/**
 *
 * @author sahil
 */
public class ArrayListImplementation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> a = new ArrayList<String>();
        List<String> b = new ArrayList<String>();
        a.add("RED");
        a.add("GREEN");
        a.add("BLUE");
        a.add("ORANGE");
        //a.add(0,"WHITE");
        //System.out.println(a.get(3));
        //b.add("NOTHING");
        //b.addAll(a);
       b=a.subList(1, 3);
      //String[] s;
      //s = b.toArray();
       //Collections.reverse(b);
       //Collections.shuffle(b);
       // a.add(a.indexOf("RED"),"Black");
        //a.remove(3);
        //System.out.println(a.get(3));
        //System.out.println(a.contains("ORANGE"));
        //Collections.sort(a);
      //b.removeAll(b);
      
       //a.ensureCapacity(6);
      System.out.println(b.isEmpty()); 
      for(String st :b)
        {
            System.out.println(st+" ");
        }
        
    }
}
