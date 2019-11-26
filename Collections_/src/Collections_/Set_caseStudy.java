package Collections_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Set_caseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	//HashSet<String> set=new HashSet<String>();
	int count=0,num;
	String symbol;
	Set<NewCard> set=new TreeSet<NewCard>(new Symbol()); 
	//treeset display in natural order
	NewCard[] c=new NewCard[40];
	int n=s.nextInt();
	while(set.size()<n)
	{
		symbol=s.next();
		num=s.nextInt();
		c[count]=new NewCard(); //each time its creates new array
		c[count].setSymbol(symbol);
		c[count].setNum(num);
		set.add(c[count]);
		count++;
	}
	System.out.println(n+"Symbols gathered in "+count+" cards");
	System.out.println("cards are ");
	
	Iterator<NewCard> itr=set.iterator(); 
	while(itr.hasNext())
	{
		NewCard ca=(NewCard)itr.next();
		System.out.println(ca.getSymbol()+" "+ca.getNum());
	}
	}

}
