package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection2 
{
	public static void main (String[]args)
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("Anta");
		a.add('a');
		a.add(1.11);
//		System.out.println(a);
//		System.out.println(a.get(1));
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		ArrayList<Double> c=new ArrayList<Double>();
		c.add(1.11);
		c.add(2.22);
		c.add(3.33);
		LinkedList<String>d=new LinkedList<String>();
		d.add("RAHUL");
		d.add("Anta");
		d.add("ABC");
		d.add("XYZ");
		//all data print
		//System.out.println(d);
		//specific data print-get method
//		System.out.println(d.get(0));
//		System.out.println(d.get(1));
//		System.out.println(d.get(2));
//		System.out.println(d.get(3));
		
		int sizeOfList=d.size();
		System.out.println("sizeOfList is"+sizeOfList);
		
		for (int i=0;i<sizeOfList;i++)
		{
			//System.out.println(d.get(i));
			
		}
	
		//replace the value /data
				//set method

		d.set(0,"Anta");
		System.out.println(d);
		
		//delete one ele
				//remove method
		d.remove(2);
		System.out.println(d);
		

	
	}
}
