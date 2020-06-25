package ch02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/ch02/stream_kind/linedata.txt");
		Stream<String> stream;

		// Files.lines()Method 이용
		stream = Files.lines(path, Charset.defaultCharset());// 운영체제의 기본 문자셋
		stream.forEach(System.out::println);
		System.out.println();

		// BufferdReader의 lines()Method 이용
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(t -> System.out.println(t));
		stream.close();
	}
}