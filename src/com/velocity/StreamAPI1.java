package com.velocity;

import java.util.Arrays;
import java.util.List;

public class StreamAPI1 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("silver", "gold", "platinum");
		list.stream().forEach(a -> System.out.println(a));
	}

}
