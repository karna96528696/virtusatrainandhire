import java.util.*;
public class Main {
 public static String retrieveMaxScoredStudent(String[] j1){
  Map<String, Integer> m1=new HashMap<String, Integer>();
  for(int i=0;i<j1.length;i++){
   String j2= j1[i]; 
   StringTokenizer t=new StringTokenizer(j2,"#");
   String j3=t.nextToken();
   int c1=Integer.parseInt(t.nextToken());
   int c2=Integer.parseInt(t.nextToken());
   int c3=Integer.parseInt(t.nextToken());
   int N=c1+c2+c3;
   m1.put(j3, N);
   }
  //System.out.println(m1);
  int max=0;
  String m=new String();
  Iterator<String> i=m1.keySet().iterator();
  while(i.hasNext()){
   String j4=i.next();
   int x=m1.get(j4);
   if(x>max){
    max=x;
    m=j4; }
  }
  return m;
 }
 public static void main(String[] args) {
  String[] j1={"arun#12#12#12","deepak#13#12#12","puppy#12#11#12"};
  System.out.println(retrieveMaxScoredStudent(j1));
 }
}
