package week3.day1;

import java.util.ArrayList;

import week1.day1.*;

public class GroupArrayList {

	private ArrayList list;

	public GroupArrayList(int size) {
		super();
		list = new ArrayList(size);
	}

	public void add(Student s) {
		list.add(s);
	}

	public void removeLast() {
		list.remove(list.size() - 1);
	}

	public void randomRemove() {
		if (list.size() < 1) {
			System.out.println("Can not remove");
		} else {
			list.remove((int) (Math.random() * list.size()));
		}
	}
	
	public void showAll(){
		for(Object el : list){
			System.out.println(el);
		}
	}
	
	public void showByAge(int age){
		for(int i = 0; i < list.size(); i++){
			
			Object o = list.get(i);
			Student s = (Student) o;
			
			if(s.getAge() == age){
				System.out.println(s);
			}
		}
	}
	
	public boolean hasStudent(Student s){
		return list.contains(s);
	}

}
