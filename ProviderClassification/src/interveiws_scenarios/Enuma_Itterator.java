package interveiws_scenarios;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class Enuma_Itterator {
	
	public void EnumartorTest() {
		
		Vector<Integer> Vector= new Vector();
		
		Vector.add(5);
		Vector.add(585);
		Vector.add(45);
		Vector.add(10);
		Vector.add(4);
		Vector.add(0, 21);
		Vector.add(1, 22);
		Vector.add(2, 25);
		
		
		Enumeration<Integer> ele=Vector.elements();
		while(ele.hasMoreElements()) {
			
			int han=ele.nextElement();
			System.out.println(han);
			
		}}
		
		
		public	 void ItterratorTest() {
			
			int arr[] = {1,2,3,4,10};
			char nam[]= {'a','d','f','r'};
			
			Arrays.asList(arr);
			Arrays.asList(nam);
		
			ArrayList conarr= new ArrayList();
	
			conarr.add("Apple");
			conarr.add("Ball");
			Iterator numse= conarr.iterator();
			
			while(numse.hasNext()) {
			System.out.println(numse.next());}
			conarr.toArray(); 
			
			
		}
		
		public	 void HashsetTest() {
			
			
			HashSet<String> jan =new  HashSet();
			
			jan.add("Apple");
			jan.add("Zzzzzz");
			jan.add("India");
			jan.add("Mapped");
			jan.add("Sanity");
			jan.add("Sanity");
			//ArrayList se= new ArrayList();
			//se.add(jan);
			jan.remove("Apple");
			
			Iterator numfr= jan.iterator();
			while(numfr.hasNext()) {
				System.out.println(numfr.next());}
			
			
			
		}
	    
	
	

	public static void main(String[] args) {
		
		Enuma_Itterator gum= new Enuma_Itterator();
		//gum.EnumartorTest();
		
		
		gum.HashsetTest();
		
		

	}

}
