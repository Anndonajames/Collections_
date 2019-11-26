package Collections_;

import java.util.ArrayList;
import java.util.Iterator;

public class fresggrad_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList list=new ArrayList();
//		    list.add("First");
//		    list.add("Second");
//		    list.add("Third");
//		    list.add("Random");
		 int n=4,i;
		 for(i=0;i<n;i++)
		 {
			 list.add(i);
		 }
		    System.out.print("Actual  ArrayList:[[");
		    Iterator itr=list.iterator();
		    while(itr.hasNext())
		    {
		      System.out.print(itr.next()+",");
		    }
		    System.out.println("]]");
		    list.clear();
		    
		    System.out.print("After clear ArrayList:[]");
		    Iterator itr1=list.iterator();
		    while(itr1.hasNext())
		    {
		      System.out.println(itr.next());
		    }
		    
	}

}
