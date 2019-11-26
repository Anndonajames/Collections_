package Collections_;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;

public class collection_casestudy_installation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		int i,n;
		ArrayList list=new ArrayList();
		do {
		System.out.println("1)Display Installed Applications"
				+ "\n2)Install  application\n3)Uninstall  application\n4)Quit");
		n=s.nextInt();
		switch(n)
		{

		case 1:{

		Iterator itr=list.iterator();
		if(list.isEmpty()) {
		System.out.println("There is no application installed");
		}
		else
		{
		int j=0;
		while(itr.hasNext()) {
		System.out.println(j+ " "+itr.next());
		j++;
		}
		}
		}
		break;
		case 2:{
		System.out.println("Enter the application to install ");
		String app=s.next();
		if(list.contains(app))
		{
			System.out.println("App is already installed");
		}
		else
		list.add(app);
		
		}break;
		case 3:
		{
		Iterator itr1=list.iterator();
		for(i=0;i<list.size();i++) {
		System.out.println(i+" "+itr1.next());
		}
		if(list.isEmpty())
		{
			System.out.println("No application installed");
		}
		else
		{
		System.out.println("Enter the index of application to be removed");
		int index=s.nextInt();
		list.remove(index);
		System.out.println("App Uninstalled Sucessfully ");
		}
		}
		break;
		case 4:{
		System.exit(0);
		}
		break;
		default:
		{
			System.out.println("Invalid Input !"
					+ "Check your option.\n");
		}
			break;
		}
	
		}
		while(true) ;

		}
		}