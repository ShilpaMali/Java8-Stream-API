package com.velocity;

import java.util.stream.Stream;

public class StreamAPI5 {
	public static void main(String[] args) {

		Stream<Integer> st = Stream.of(25);
		st.forEach(p -> System.out.println(p));
	}

}
