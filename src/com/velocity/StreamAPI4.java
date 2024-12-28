package com.velocity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamAPI4 {
	public static void main(String[] args) throws IOException {

		Path p = Paths.get("C:\\Users\\Jeevan\\Desktop\\test.txt");
		Stream<String> st = Files.lines(p);
		st.forEach(s -> System.out.println(s));
	}

}
