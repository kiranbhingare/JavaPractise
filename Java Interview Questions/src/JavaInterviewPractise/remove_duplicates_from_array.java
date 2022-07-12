package JavaInterviewPractise;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class remove_duplicates_from_array {

	public static void main(String[] args) {
		List <Integer> arr = new ArrayList <Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		arr.add(5);
		System.out.println(arr);
		// Now let's remove duplicate element without affecting order 
		// LinkedHashSet will guaranteed the order and since it's set 
		// it will not allow us to insert duplicates. 
		// repeated elements will automatically filtered.
		
		Set <Integer> array = new LinkedHashSet<Integer>(arr);
		System.err.println(array);
		// now let's clear the ArrayList so that we can 
		// copy all elements from LinkedHashSet 
		arr.clear(); 
		// copying elements but without any duplicates 
		arr.addAll(array);
		System.out.println("list of primes without duplicates : " + arr);

		//Read more: https://www.java67.com/2015/03/how-to-remove-duplicates-from-arraylist.html#ixzz7YoOxKXoS

	}

}
