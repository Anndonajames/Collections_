package Collections_;

import java.util.HashSet;
import java.util.Iterator;

public class hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set=new HashSet<String>();
set.add("jianna");
set.add("annu");
set.add("riya");
set.add("Zerah");
set.add("riya");
set.add("liya");
Iterator<String> itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}


	}

}
