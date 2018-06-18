package com.basic;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class ArrayListExamples {
	

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		System.out.println(list.size());
		list.add("three");
		System.out.println(list.get(0));
		/*Student s1 = new Student("jaya",96,"731615106029");
		Student s2 = new Student("kavi",98,"731615106036");
		Student s3 = new Student("kd",97,"731615106040");
		//Student[]stuArr = {s1,s2,s3};
		List<String> StudList = new ArrayList<String>();   
		System.out.println(StudList.get(1));*/
		LinkedList<String> linkedList = new LinkedList();
		linkedList.add("one");
		linkedList.add("two");
		linkedList.add("three");
		System.out.println(linkedList);
		Iterator<String> itr = linkedList.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		for(String str : linkedList) {
			System.out.println(str);
		}
	}

}
