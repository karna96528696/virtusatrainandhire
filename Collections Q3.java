/* NagaSaiChoudaryNarra Collections Q3 */
import java.util.*;
public class Hashmap {    
  static  HashMap<Integer,Integer> nj = new HashMap<Integer,Integer>();       
    
     public static void main(String[] args) {
         nj.put(10, 24);
         nj.put(11, 22);
         nj.put(21, 44);
         nj.put(25, 46);
         int count =0;
         int sum= 0;
         
         Iterator<Map.Entry<Integer,Integer>> itr = sk.entrySet().iterator();
         while(itr.hasNext()) {
             Map.Entry<Integer, Integer> nj = itr.next();
             if(nj.getKey()%2 !=0) {
                 sum +=  nj.getValue();
                 count++;
                 
             }
         }
         
         System.out.println(sum/count + " The average" );
} 

}
