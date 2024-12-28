package com.velocity;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		// list is input
		set.add("mumbai");
		set.add("pune");
		set.add("bangalore");
		set.add("delhi");

		set.stream().forEach(s -> System.out.println(s));
	}

}
