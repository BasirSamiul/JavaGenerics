package com.samiul.java.generics;

import com.samiul.java.generics.MyCustomList;

public class GenericsRunner {

	public static void main(String[] args) {

		MyCustomList<String> list = new MyCustomList<String>();

		MyCustomList<Integer> listforIntValue = new MyCustomList<Integer>();

		list.addElement("Samiul Basir");
		list.addElement("Sukhi Moni");

		listforIntValue.addElement(1);
		listforIntValue.addElement(2);
		listforIntValue.addElement(3);
		listforIntValue.addElement(4);

		list.showElement();
		listforIntValue.showElement();

	}

}
