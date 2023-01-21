package com.xworkz.task.boot;

import java.util.LinkedList;

public class Remove {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("web");
		list.add("java");
		list.add("sql");

		list.forEach(c -> System.out.println(c));
		list.removeFirst();
		System.out.println("removed first element");

		list.forEach(c -> System.out.println(c));
		list.removeLast();
		System.out.println("removed last element");
	}

}
