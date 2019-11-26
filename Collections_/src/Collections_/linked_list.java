package Collections_;

import java.util.LinkedList;
import java.util.Scanner;

public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i;
	LinkedList<String> list=new LinkedList<String>();
//	for(i=0;i<n;i++)
//	{
//		String name=s.next();
//		list.add(name);
//	}
//	String str1=s.next();
//	System.out.println("Size of the list"+list.size());
//	System.out.println("List id "+list.isEmpty());
//	}
	
	for(i=0;i<n;i++)
	{
		System.out.println("Enter your name:");
		String name=s.next();
		list.add(name);
		System.out.println("Enter your address:");
		String address=s.next();
		list.add(address);
		System.out.println("Enter your qualification:");
		String qualification=s.next();
		list.add(qualification);
		System.out.println("Enter your age:");
		String age=s.next();
		list.add(age);
		System.out.println("Enter your salary:");
		String salary=s.next();
		list.add(salary);
	}
	System.out.println(list.getFirst());
	//System.out.println(list.indexOf(name));
	System.out.println(list.getLast());
	System.out.println(list.remove(0));
	System.out.println(list.size());
	System.out.println(list.isEmpty());
	}
}
