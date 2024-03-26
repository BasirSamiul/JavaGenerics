package com.samiul.java.generics;

import java.util.ArrayList;

public class MyCustomList <T> {

	ArrayList<T> list = new ArrayList<T>();

	public void addElement(T element) {
		list.add(element);

		System.out.println("Element added Successfully!!!");
	}

	public void removeElement(T element) {
		list.remove(element);

		System.out.println("Element remove Scucessfully!!!");
	}

	public void showElement() {
		System.out.println(list);
	}

}
