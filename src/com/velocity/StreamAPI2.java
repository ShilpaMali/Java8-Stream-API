package com.velocity;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPI2 {
	public static void main(String[] args) {

		String[] s = { "ajay", "vikas", "yogesh" };
		Stream<String> st = Arrays.stream(s);
		st.forEach(b -> System.out.println(b));
	}

}
