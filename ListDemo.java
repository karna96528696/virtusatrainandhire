package CollectionDemo;
import java.util.ArrayList;
import java.util.List;
public class ListDemo {
			static List<String> alist;
			static List<Integer> blist;
			static List<Integer> clist;
		
			public static void method1()
			{
			alist=new ArrayList<String>();
			alist.add("India");
			alist.add("pakistan");
			alist.add("austrelia");
			alist.add("iran");
			alist.add("japan");
			System.out.println(alist);
			}
			public static void method2()
			{
				blist=new ArrayList<Integer>();
				for(int i=1;i<=10;i++)
				{
					blist.add(i);
				}
				System.out.println(blist);
				/*//By using enhanced for loop
				for(int j : blist)
				{
					System.out.println(j);
				}*/
			}
			public static void method3()
			{
				clist=new ArrayList<Integer>();
				for(int i=11;i<=15;i++)
				{
					clist.add(i);
				}
				blist.addAll(clist);
				System.out.println(blist);
				/* //By using enhanced for loop
				 for(int k: clist)
				{
					System.out.println(k);
				}*/
			}
			public static void main(String[] args)
			{
			method1();
			method2();
			method3();
			}
}
