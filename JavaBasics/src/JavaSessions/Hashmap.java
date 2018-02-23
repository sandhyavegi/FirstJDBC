package JavaSessions;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "selenium");
		hm.put(2, "qtp");
		hm.put(3,"java");
		System.out.println(hm);

	for(Entry m:hm.entrySet()){
		System.out.println(m.getKey()+ " "+ m.getValue());
		
	}
	
	
	HashMap<Integer,Emplyoeeclass> emp=new HashMap<Integer,Emplyoeeclass>();
	 Emplyoeeclass e1=new  Emplyoeeclass(1,"tom","QA");
	 Emplyoeeclass e2=new  Emplyoeeclass(1,"david","java");
	 Emplyoeeclass e3=new  Emplyoeeclass(1,"peter","dev");
	
	emp.put(1, e1);
	emp.put(2, e2);
	emp.put(3, e3);
	for(Entry<Integer,Emplyoeeclass> k:emp.entrySet()){
		int key=k.getKey();
		 Emplyoeeclass e=k.getValue();
	
	System.out.println(key);
	
	System.out.println(e.age+ " "+e.name+ " "+e.pass);
	}
	
	
	
	
	
	
	
	
	
	}




}
