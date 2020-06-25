package ch02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

//Directory로 부터 Stream 얻기
public class FromDirectoryExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/workspace/java");
		Stream<Path> stream = Files.list(path);
		stream.forEach(t -> System.out.println(t.getFileName()));
	}
}