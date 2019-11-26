package Collections_;

import java.util.ArrayList;
import java.util.Scanner;


import java.util.Iterator;
public class Freshgrad_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    //type your code here
		    Scanner s=new Scanner(System.in);
		    ArrayList <String> list=new ArrayList();
		    int i;
		   list.add("First");
		   list.add("Second");
		   list.add("Third");
		   ArrayList<String> list1=new ArrayList<String>();
		   list1.add("Random");
		   list1.add("one");
		   list1.add("two");
		   list.addAll(list1);
		   Iterator itr=list.iterator();
		   while(itr.hasNext())
		   {
			   System.out.println(itr.next());
		   }
		   
		   /*
		    * As per the question
		    */
		  /* ArrayList list1=(ArrayList) list.clone();
		   list.remove(5);
		   list.remove(4);
		//  System.out.println(list.get(3));
		//  System.out.println(list1.get(4));
		 Iterator itr=list.iterator();
		 System.out.println("Orginal ArrayList");
       	  while(itr.hasNext())
		  {
		    System.out.println(itr.next());
		  }
       	System.out.println("After Cpoy");
		     Iterator itr1=list1.iterator();
		  while(itr1.hasNext())
		  {
		    System.out.println(itr1.next());
		  }
		  */
		   
		   
		   
}
}