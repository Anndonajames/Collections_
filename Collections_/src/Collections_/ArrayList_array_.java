package Collections_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name,dept;
	int age,i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=s.nextInt();
	ArrayList al=new ArrayList();
	Employee[] emp=new Employee[n];
	for(i=0;i<n;i++)
	{
		System.out.println("Enter the name:");
		name=s.next();
		System.out.println("Enter the age:");
		age=s.nextInt();
		System.out.println("Enter the department:");
		dept=s.next();
	emp[i]=new Employee();
	
	
	emp[i].setAge(age);
	emp[i].setName(name);
	emp[i].setDept(dept);
	al.add(emp[i]);
	}
	Iterator<Employee> itr=al.iterator();
	while(itr.hasNext())
	{
		Employee e=itr.next();
		System.out.println(e.getName()+" "+e.getAge()+" "+e.getDept()+" ");  //encapsulation is incoorporated
	}
	
		
		
	
	}
	
	
	}


