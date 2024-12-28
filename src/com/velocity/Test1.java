package com.velocity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		// list is input
		list.add("mumbai");
		list.add("pune");
		list.add("bangalore");
		list.add("delhi");

		Stream<String> st = list.stream();
		st.forEach(p -> System.out.println(p));

		list.stream().forEach(s -> System.out.println(s));
	}

}
