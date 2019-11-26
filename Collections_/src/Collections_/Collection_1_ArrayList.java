package Collections_;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;

public class Collection_1_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=s.nextInt();
	ArrayList list=new ArrayList();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the name:");
		String name=s.next();
		System.out.println("Enter the age:");
		int age=s.nextInt();
		list.add(name); 
		list.add(age);
		
	}
	String name1=s.next();
	list.set(0, name1); //to update the value
	System.out.println(list.get(0));
	Iterator itr=list.iterator();
	list.removeAll(list);
	//list.clear(); //to clear values
	while(itr.hasNext())  
	{
		System.out.println(itr.next());
	}
	
	ArrayList list1=(ArrayList) list.clone();  //to copy values from one variable to another list variable
	//System.out.println("Clone Value"+list1.get(0));
	//System.out.println(list.get(0));
//	list.remove(0); //remove
	
//	System.out.println(list1.get(0));//get the value


	
	
	
	
	
	
	
	
	}

}
