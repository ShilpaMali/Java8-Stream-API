package com.velocity;

import java.util.stream.Stream;

public class StreamAPI3 {
	public static void main(String[] args) {

		Stream<Object> st = Stream.builder().add("ram").add("shyam").add("sandip").build();
		st.forEach(a -> System.out.println(a));
	}

}
