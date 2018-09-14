package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collections_class_check {
	public static void main(String[] args) {
		
		/*
		 * see the example and explanation from https://www.decodejava.com/java-arraylist.htm
		 */
		
		List<String> al=new ArrayList<String>(3);
		al.add("mango");
		al.add("grapes");
		al.add("99");
		al.add("A");
		al.add("a");
		al.add(1, "banana");
		System.out.println(al);
		System.out.println("####################################################");
		Object[] ab=al.toArray();
		for(Object element :ab){
			System.out.print(element+" ");
		}
	
		al.remove(0);
		System.out.println(al.get(3));
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<String> oal=new ArrayList<String>();
		oal.add("nilmani");
		oal.add("khata hai");
		oal.add("bhut");
		
		al.addAll(1, oal);
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		/*System.out.println(al);*/
		System.out.println();
		Collections.sort(al);
		System.out.println(al);
		
		//convert the arrayList to object array using toArrray method
		
		Object[] obj=al.toArray();
		
		//Enhanced for loop uses Iterator object internally but for iterator we have to create external object  
		
		for(Object a:obj){
			System.out.print(a+" ");
		}
		
		
		
		
	}

}
