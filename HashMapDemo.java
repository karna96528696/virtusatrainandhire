package CollectionDemo;
import java.io.*;
import java.util.*;
public class HashMapDemo {
	    public static void m1()
	    {
	        Map<Integer, String> hm1
	            = new HashMap<Integer, String>();
	        hm1.put(1, "abc");
	        hm1.put(2, "def");
	        hm1.put(3, "ghi");

	    Set entrySet = hm1.entrySet();
	    Iterator it = entrySet.iterator();
	    while(it.hasNext())
	    {
	       Map.Entry me = (Map.Entry)it.next();

	       System.out.println(me.getKey() + 
	       "  " + me.getValue()); 
	    }
	}
	    public static void main(String args[])
	    {
	       m1();
	    }
}
