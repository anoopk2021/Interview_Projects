package main;

import java.util.HashMap;
import java.util.Iterator;

public class Iteration_Over_Hashmap {

    public static void main(String args[])
    {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface
        hm.put(110,"Ravi");
        hm.put(120,"Prateek");
        hm.put(130, "Davesh");
        hm.put(140, "Kamal");
        hm.put(150, "Pawan");
        Iterator<Integer> it = hm.keySet().iterator();       //keyset is a method
        while(it.hasNext())
        {
            int key=(int)it.next();
            System.out.println("Roll no.: "+key+"     name: "+hm.get(key));
        }
    }
}
