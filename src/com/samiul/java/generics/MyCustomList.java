package com.samiul.java.generics;

import java.util.ArrayList;

public class MyCustomList {

	ArrayList<String> list = new ArrayList<String>();

	public void addElement(String element) {
		list.add(element);

		System.out.println("Element added Successfully!!!");
	}

	public void removeElement(String element) {
		list.remove(element);

		System.out.println("Element remove Scucessfully!!!");
	}

	public void showElement() {
		System.out.println(list);
	}

}
