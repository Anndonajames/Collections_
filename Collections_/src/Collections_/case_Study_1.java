package Collections_;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class case_Study_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Customers:");
		int n=s.nextInt();
		String name,address,num,email,proof_type,proof_id;
		System.out.println("Registration");
		ArrayList list=new ArrayList();
		Register[] reg=new Register[n];
		int i=1;
		for(i=0;i<n;i++)
		{
		System.out.println("Enter your name:");
		name=s.next();
		System.out.println("Enter your address:");
		address=s.next();
		System.out.println("Contact Number:");
		num=s.next();
		System.out.println("E-Mail ID:");
		email=s.next();
		System.out.println("Enter proof type:");
		proof_type=s.next();
		System.out.println("Enter proof Id");
		proof_id=s.next();
		reg[i]=new Register();
		reg[i].setName(name);
		reg[i].setAddress(address);
		reg[i].setNum(num);
		reg[i].setEmail(email);
		reg[i].setProof_type(proof_type);
		reg[i].setProof_id(proof_id);
		
		System.out.println("Thank you for registering.Your id is 1...");
		System.out.println("Do you want to update email(yes/no)?");
		String op=s.next();
		String opp=op.toLowerCase();
	
		if(opp.equals("yes"))
		{
			System.out.println("Enter the  update  email");
			String email2=s.next();
			reg[i].setName(name);
			reg[i].setAddress(address);
			reg[i].setNum(num);
			reg[i].setEmail(email2);
			reg[i].setProof_type(proof_type);
			reg[i].setProof_id(proof_id);
		}
		else
		{
			
			reg[i].setName(name);
			reg[i].setAddress(address);
			reg[i].setNum(num);
			reg[i].setEmail(email);
			reg[i].setProof_type(proof_type);
			reg[i].setProof_id(proof_id);
			
		}
		list.add(reg[i]);
		}
		Iterator<Register> itr=list.iterator();
		int j=1;
		while(itr.hasNext())
		{
			Register r=itr.next();
			System.out.println("Employee Details "+j);
			System.out.println("Name :"+r.getName());
			System.out.println("Address :"+r.getAddress());
			System.out.println("Contact Number :"+r.getNum());
			System.out.println("Email ID :"+r.getEmail());
			System.out.println("Proof Type :"+r.getProof_type());
			System.out.println("Proof Id :"+r.getProof_id());
			System.out.println("            ");
			
			j++;
		}
		//Display all customers to delete a customer
		Iterator<Register> itr1=list.iterator();
		int k=0;
		while(itr1.hasNext())
		{
			Register r1=itr1.next();
			System.out.println("Id :"+k);
			System.out.println("Name :"+r1.getName());
			
			k++;
		}
		System.out.println("Do you want to delete any customer?(yes/no)");
		String del=s.next();
		String del1=del.toLowerCase();
		if(del1.equals("yes"))
		{
			System.out.println("Enter the index value of customer:");
			int index=s.nextInt(); //index value starts with zero
			list.remove(index);
		}
		
		Iterator<Register> itr2=list.iterator();
		int l=1;
		while(itr2.hasNext())
		{
			Register r3=itr2.next();
			System.out.println("Employee Details "+l);
			System.out.println("Name :"+r3.getName());
			System.out.println("Address :"+r3.getAddress());
			System.out.println("Contact Number :"+r3.getNum());
			System.out.println("Email ID :"+r3.getEmail());
			System.out.println("Proof Type :"+r3.getProof_type());
			System.out.println("Proof Id :"+r3.getProof_id());
			System.out.println("            ");
			
			l++;
		}
		
		
				
		
	}
		}

