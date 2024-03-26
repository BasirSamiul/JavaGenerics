package com.samiul.java.generics;

import  com.samiul.java.generics.MyCustomList;

public class GenericsRunner {

	public static void main(String[] args) {
		
		MyCustomList list = new MyCustomList();
		
		list.addElement("Samiul Basir");
		list.addElement("Sukhi Moni");
		
		list.showElement();
		
	}

}
