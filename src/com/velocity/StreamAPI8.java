package com.velocity;

import java.util.stream.Stream;

public class StreamAPI8 {
	public static void main(String[] args) {

		Stream<Integer> st = Stream.of(10,30,50,70,90);
		st.forEach(p -> System.out.println(p));
	}

}
