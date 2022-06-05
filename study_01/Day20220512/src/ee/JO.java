package ee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class JO {
   public static void main(String[] args) {
      Set list = new HashSet();
      int jo = (int)(Math.random() * 5) + 1;
      
//      list.add(jo+"조 : ");
      
      for(; list.size() < 6;) {
         int num = (int)(Math.random() * 45) + 1;
         list.add(num);
      }
      
      Iterator it = list.iterator();
      
      while(it.hasNext())
         System.out.print(it.next() + "\t");
   }
}