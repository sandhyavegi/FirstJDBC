package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class arraylist {

	public static void main(String[] args) {
		LinkedList<String>  array = new LinkedList<String>();
		array.add("blue");
		array.add("orange");
		array.add("red");
		array.add("green");
		array.add("black");
LinkedList<String> array1 = new LinkedList<String>();
array1.add("shirt");
array1.add("blue");
array1.addAll(array);	
System.out.println(array1);
	}

}
