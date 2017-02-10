
// Make sure to change the below line to match with the name of your package
package samples;

import java.util.ArrayList;

/*
 * Author: Charlie2
 * ArrayListDemo: Week 4 - Intro to Array, ArrayList
 */
public class ArrayListDemo {

	private static final Object[] Arraylist = null;
	private static final int String = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Students = new ArrayList<String>();
		
		System.out.println("ArrayList Size is: " + Students.size());
		
		Students.add("Eric");
		System.out.println("ArrayList Size is: " + Students.size());
		
		System.out.println("ArrayList Element[0] is: " + Students.get(0));
		
		Students.add(1, "Mike");
		System.out.println("ArrayList Size is: " + Students.size());
		
		System.out.println("========");
		
		Students.add(1, "Bob");
		System.out.println("ArrayList Size is: " + Students.size());
		
		for (int i = 0;i<Students.size(); i++){
			System.out.println("Student[" + i + "]: " + Students.get(i));
		} //end for
		
		System.out.println("========");
		Students.remove(0);
		for (int i = 0;i<Students.size(); i++){
			System.out.println("Student[" + i + "]: " + Students.get(i));
		} // end for
		

	} // end main

} // end class
