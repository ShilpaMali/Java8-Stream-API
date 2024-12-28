package com.velocity;

import java.util.stream.Stream;

public class StreamAPI7 {
	public static void main(String[] args) {

		Stream<String> st = Stream.of("pune", "mumbai", "delhi");
		st.forEach(p -> System.out.println(p));
	}

}
