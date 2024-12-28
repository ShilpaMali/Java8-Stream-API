package com.velocity;

import java.util.stream.Stream;

public class StreamAPI6 {
	public static void main(String[] args) {

		Stream<String> st = Stream.of("pune");
		st.forEach(p -> System.out.println(p));
	}

}
